package org.example.ejercicio4;


import org.example.ejercicio1y2.VersionedStack;
import org.example.ejercicio3.QueueConVersionedStack;

public class MapFunctions {

    /**
     * Convierte una instancia de VersionedStack en una QueueConVersionedStack.
     * Precondición: la pila no debe ser null.
     * Postcondición: se devuelve una cola con los mismos elementos en el mismo orden.
     * Estrategia: recorremos la pila y encolamos los valores desde la base hasta el tope.
     */
    public static QueueConVersionedStack mapToQueue(VersionedStack pila) {
        QueueConVersionedStack cola = new QueueConVersionedStack();
        VersionedStack auxiliar = new VersionedStack();

        // Invertimos pila original en auxiliar para preservar orden
        while (pila.tamanio() > 0) {
            auxiliar.push(pila.tope());
            pila.pop();
        }

        // Encolamos desde auxiliar y restauramos pila original
        while (auxiliar.tamanio() > 0) {
            int valor = auxiliar.tope();
            pila.push(valor);
            cola.encolar(valor);
            auxiliar.pop();
        }

        return cola;
    }

    /**
     * Convierte una instancia de QueueConVersionedStack en una VersionedStack.
     * Precondición: la cola no debe estar vacía.
     * Postcondición: devuelve una pila con los elementos de la cola en orden inverso (último encolado arriba).
     * Estrategia: desencolamos y apilamos para invertir el orden.
     */
    public static VersionedStack mapToVersionedStack(QueueConVersionedStack cola) {
        VersionedStack pila = new VersionedStack();
        QueueConVersionedStack auxiliar = new QueueConVersionedStack();

        while (!cola.estaVacia()) {
            int valor = cola.verPrimero();
            cola.desencolar();
            pila.push(valor);
            auxiliar.encolar(valor);
        }

        while (!auxiliar.estaVacia()) {
            cola.encolar(auxiliar.verPrimero());
            auxiliar.desencolar();
        }

        return pila;
    }
}