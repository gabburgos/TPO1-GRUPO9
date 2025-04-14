package org.example;

import org.example.ejercicio1y2.VersionedStack;
import org.example.ejercicio3.QueueConVersionedStack;
import org.example.ejercicio4.MapFunctions;
import org.example.ejercicio5.Tuple;
import org.example.ejercicio6.Relation;


public class Main {
    public static void main(String[] args) {
        // === EJERCICIO 1 y 2 ===
        System.out.println("\n--- Ejercicio 1 y 2: VersionedStack ---");
        VersionedStack pila = new VersionedStack();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Tope actual: " + pila.tope());
        System.out.println("Versión actual: " + pila.getVersionActual());
        System.out.println("Cantidad de versiones: " + pila.cantidadDeVersiones());
        pila.pop();
        System.out.println("Tope tras pop: " + pila.tope());
        pila.irAVersion(1);
        System.out.println("Tope de versión 1: " + pila.tope());
        pila.borrarVersion(0);
        System.out.println("Cantidad de versiones tras borrar: " + pila.cantidadDeVersiones());

        // === EJERCICIO 3 ===
        System.out.println("\n--- Ejercicio 3: QueueConVersionedStack ---");
        QueueConVersionedStack cola = new QueueConVersionedStack();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        System.out.println("Primero: " + cola.verPrimero());
        cola.desencolar();
        System.out.println("Nuevo primero: " + cola.verPrimero());
        cola.desencolar();
        cola.encolar(4);
        System.out.println("Nuevo primero: " + cola.verPrimero());

        // === EJERCICIO 4 ===
        System.out.println("\n--- Ejercicio 4: Funciones map ---");
        VersionedStack pilaOriginal = new VersionedStack();
        pilaOriginal.push(100);
        pilaOriginal.push(200);
        pilaOriginal.push(300);
        QueueConVersionedStack colaMap = MapFunctions.mapToQueue(pilaOriginal);
        System.out.println("Primero mapeado desde pila: " + colaMap.verPrimero());
        VersionedStack pilaMap = MapFunctions.mapToVersionedStack(colaMap);
        System.out.println("Tope mapeado desde cola: " + pilaMap.tope());

        // === EJERCICIO 5 ===
        System.out.println("\n--- Ejercicio 5: Tuple ---");
        int[] datos = {5, 10, 15};
        Tuple t = new Tuple(datos);
        System.out.println("Tupla: " + t);
        System.out.println("Tamaño: " + t.size());
        System.out.println("Elemento en posición 1: " + t.get(1));
        System.out.println("Proyección en 2: " + Tuple.Projector.project(t, 2));

        // === EJERCICIO 6 ===
        System.out.println("\n--- Ejercicio 6: Relation ---");
        Relation r = new Relation(2);
        r.agregar(new Tuple(new int[]{1, 2, 3}));
        r.agregar(new Tuple(new int[]{4, 5, 6}));
        r.agregar(new Tuple(new int[]{7, 8, 9}));
        System.out.println("Relación:");
        System.out.println(r);
        System.out.println("Cantidad de filas: " + r.cantidadFilas());
    }
}