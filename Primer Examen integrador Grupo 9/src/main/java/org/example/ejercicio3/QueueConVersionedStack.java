package org.example.ejercicio3;


import org.example.ejercicio1y2.VersionedStack;

public class QueueConVersionedStack {
    private VersionedStack entrada;
    private VersionedStack salida;

    public QueueConVersionedStack() {
        entrada = new VersionedStack();
        salida = new VersionedStack();
    }

    /**
     * Encola un nuevo elemento al final de la cola.
     * Precondición: ninguna.
     * Postcondición: el elemento queda en la pila de entrada.
     * Estrategia: se hace push en la pila de entrada.
     */
    public void encolar(int valor) {
        entrada.push(valor);
    }

    /**
     * Desencola el primer elemento (el más antiguo).
     * Precondición: la cola no debe estar vacía.
     * Postcondición: se elimina el primer elemento encolado.
     * Estrategia: si la pila de salida está vacía, se invierten los elementos desde entrada.
     */
    public void desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");

        if (salida.tamanio() == 0) {
            moverEntradaASalida();
        }
        salida.pop();
    }

    /**
     * Devuelve el primer elemento de la cola sin eliminarlo.
     * Precondición: la cola no debe estar vacía.
     * Postcondición: no se modifica la estructura.
     */
    public int verPrimero() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");

        if (salida.tamanio() == 0) {
            moverEntradaASalida();
        }
        return salida.tope();
    }

    /**
     * Devuelve true si la cola no tiene elementos.
     */
    public boolean estaVacia() {
        return entrada.tamanio() == 0 && salida.tamanio() == 0;
    }

    // Método auxiliar para volcar pila de entrada en pila de salida (invertida)
    private void moverEntradaASalida() {
        while (entrada.tamanio() > 0) {
            int valor = entrada.tope();
            entrada.pop();
            salida.push(valor);
        }
    }
}