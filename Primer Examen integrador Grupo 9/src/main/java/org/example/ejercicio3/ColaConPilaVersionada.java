package org.example.ejercicio3;


import org.example.ejercicio1y2.VersionedStack;

public class ColaConPilaVersionada {
    private VersionedStack pilaEntrada;
    private VersionedStack pilaSalida;

    // Precondición: -
    // Postcondición: Crea una cola vacía
    // Estrategia: dos pilas versionadas vacías (no se usan las versiones)
    public ColaConPilaVersionada() {
        pilaEntrada = new VersionedStack();
        pilaSalida = new VersionedStack();
    }

    // Precondición: -
    // Postcondición: agrega el valor al final de la cola
    // Estrategia: apilar en pilaEntrada
    public void encolar(int valor) {
        pilaEntrada.apilar(valor);
    }

    // Precondición: la cola no está vacía
    // Postcondición: elimina el primer valor encolado
    // Estrategia: si pilaSalida está vacía, pasar todo desde pilaEntrada
    public void desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        if (pilaSalida.tamanio() == 0) volcarEntradaASalida();
        pilaSalida.desapilar();
    }

    // Precondición: la cola no está vacía
    // Postcondición: devuelve el primer valor encolado
    public int primero() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        if (pilaSalida.tamanio() == 0) volcarEntradaASalida();
        return pilaSalida.tope();
    }

    // Precondición: -
    // Postcondición: indica si la cola está vacía
    public boolean estaVacia() {
        return pilaEntrada.tamanio() == 0 && pilaSalida.tamanio() == 0;
    }

    // Método auxiliar para invertir pilaEntrada en pilaSalida
    private void volcarEntradaASalida() {
        while (pilaEntrada.tamanio() > 0) {
            int valor = pilaEntrada.tope();
            pilaEntrada.desapilar();
            pilaSalida.apilar(valor);
        }
    }
}