package org.example.ejercicio4;

import org.example.ejercicio1y2.VersionedStack;
import org.example.ejercicio3.ColaConPilaVersionada;

public class MapFunciones {

    // Precondición: pila no nula
    // Postcondición: devuelve una cola con los elementos de la pila (ordenados desde el fondo al tope)
    // Estrategia: invertir la pila en auxiliar, luego encolar y restaurar
    public static ColaConPilaVersionada mapAPilaACola(VersionedStack pila) {
        ColaConPilaVersionada cola = new ColaConPilaVersionada();
        VersionedStack auxiliar = new VersionedStack();

        // Invertimos pila original
        while (pila.tamanio() > 0) {
            auxiliar.apilar(pila.tope());
            pila.desapilar();
        }

        // Encolamos y restauramos pila
        while (auxiliar.tamanio() > 0) {
            int valor = auxiliar.tope();
            cola.encolar(valor);
            pila.apilar(valor);
            auxiliar.desapilar();
        }

        return cola;
    }

    // Precondición: cola no nula
    // Postcondición: devuelve una pila con los elementos de la cola (ordenados del último al primero)
    // Estrategia: desencolar, apilar, guardar en auxiliar y volver a encolar
    public static VersionedStack mapColaAPila(ColaConPilaVersionada cola) {
        VersionedStack pila = new VersionedStack();
        ColaConPilaVersionada auxiliar = new ColaConPilaVersionada();

        while (!cola.estaVacia()) {
            int valor = cola.primero();
            pila.apilar(valor);
            auxiliar.encolar(valor);
            cola.desencolar();
        }

        while (!auxiliar.estaVacia()) {
            cola.encolar(auxiliar.primero());
            auxiliar.desencolar();
        }

        return pila;
    }
}
