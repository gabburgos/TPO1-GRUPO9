package org.example;

import org.example.ejercicio1y2.VersionedStack;
import org.example.ejercicio3.ColaConPilaVersionada;
import org.example.ejercicio4.MapFunciones;


public class Main {
    public static void main(String[] args) {

        // === EJERCICIO 1 y 2: VersionedStack ===
        System.out.println("\n--- Ejercicio 1 y 2: Pila con versiones ---");
        VersionedStack pila = new VersionedStack();
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        System.out.println("Tope actual: " + pila.tope());
        pila.desapilar();
        System.out.println("Tope tras desapilar: " + pila.tope());
        pila.irAVersion(1);
        System.out.println("Volver a versión 1: tope = " + pila.tope());
        pila.borrarVersion(0);
        System.out.println("Versión actual tras borrar versión 0: tope = " + pila.tope());

        // === EJERCICIO 3: Cola usando pila versionada ===
        System.out.println("\n--- Ejercicio 3: Cola con pila versionada ---");
        ColaConPilaVersionada cola = new ColaConPilaVersionada();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        System.out.println("Primero: " + cola.primero());
        cola.desencolar();
        System.out.println("Nuevo primero: " + cola.primero());
        cola.encolar(4);
        System.out.println("Primero tras encolar 4: " + cola.primero());

        // === EJERCICIO 4: Map entre pila y cola ===
        System.out.println("\n--- Ejercicio 4: Map de pila a cola y viceversa ---");
        VersionedStack pila4 = new VersionedStack();
        pila4.apilar(5);
        pila4.apilar(10);
        pila4.apilar(15);
        ColaConPilaVersionada cola4 = MapFunciones.mapAPilaACola(pila4);
        System.out.println("Primero de la cola mapeada: " + cola4.primero());
        VersionedStack pilaMap = MapFunciones.mapColaAPila(cola4);
        System.out.println("Tope de pila mapeada: " + pilaMap.tope());
    }
}