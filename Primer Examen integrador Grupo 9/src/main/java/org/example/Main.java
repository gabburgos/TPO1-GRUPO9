package org.example;

import org.example.ejercicio1y2.VersionedStack;
import org.example.ejercicio3.ColaConPilaVersionada;
import org.example.ejercicio4.MapFunciones;
import org.example.ejercicio5.Coord;
import org.example.ejercicio5.CoordUtil;
import org.example.ejercicio6.Relacion;
import org.example.ejercicio6.Tupla;


public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1 y 2: VersionedStack
        System.out.println("\n Ejercicio 1 y 2: Pila con versiones");
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

        // EJERCICIO 3: Cola usando pila versionada
        System.out.println("\n Ejercicio 3: Cola con pila versionada");
        ColaConPilaVersionada cola = new ColaConPilaVersionada();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        System.out.println("Primero: " + cola.primero());

        cola.desencolar();
        System.out.println("Nuevo primero: " + cola.primero());

        cola.encolar(4);
        System.out.println("Primero tras encolar 4: " + cola.primero());

        // EJERCICIO 4: Map entre pila y cola
        System.out.println("\n Ejercicio 4: Map de pila a cola y viceversa");
        VersionedStack pila4 = new VersionedStack();
        pila4.apilar(5);
        pila4.apilar(10);
        pila4.apilar(15);
        ColaConPilaVersionada cola4 = MapFunciones.mapAPilaACola(pila4);
        System.out.println("Primero de la cola mapeada: " + cola4.primero());

        VersionedStack pilaMap = MapFunciones.mapColaAPila(cola4);
        System.out.println("Tope de pila mapeada: " + pilaMap.tope());

        // EJERCICIO 5: TDA Coord
        System.out.println("\n Ejercicio 5: Coordenadas tridimensionales");
        int[] componentes = {9, 0, 54};
        Coord coordenada = new Coord(componentes);
        System.out.println("Coordenada creada: " + coordenada);

        int x = CoordUtil.proyectarComponente(coordenada, 0);
        int y = CoordUtil.proyectarComponente(coordenada, 1);
        int z = CoordUtil.proyectarComponente(coordenada, 2);

        System.out.println("Componente X: " + x);
        System.out.println("Componente Y: " + y);
        System.out.println("Componente Z: " + z);

        // EJERCICIO 6: Tuplas y relaciones con coordenadas
        System.out.println("\n Ejercicio 6: Tuplas y Relaciones");

        // Crear algunas coordenadas
        Coord c1 = new Coord(new int[]{1, 2, 3});
        Coord c2 = new Coord(new int[]{4, 5, 6});
        Coord c3 = new Coord(new int[]{7, 8, 9});
        Coord c4 = new Coord(new int[]{11, 12, 13});
        Coord c5 = new Coord(new int[]{14, 15, 16});
        Coord c6 = new Coord(new int[]{-6, -90, -3});

        // Crear tuplas que contengan coordenadas
        Tupla t1 = new Tupla(new Object[]{c1});
        Tupla t2 = new Tupla(new Object[]{c2});
        Tupla t3 = new Tupla(new Object[]{c3});

        // Crear una relación de 3 tuplas
        Relacion relacion = new Relacion(2); // capacidad inicial = 2
        relacion.agregar(t1);
        relacion.agregar(t2);
        relacion.agregar(t3);

        // Mostrar la relación
        System.out.println("Relación de coordenadas: " + relacion);

        //Coord es octante True o False
        System.out.println("Coord 1 está en el primer octante? " + c1.estaEnPrimerOctante());
        System.out.println("Coord 2 está en el primer octante? " + c2.estaEnPrimerOctante());
        System.out.println("Coord 3 está en el primer octante? " + c3.estaEnPrimerOctante());
        System.out.println("Coord 4 está en el primer octante? " + c4.estaEnPrimerOctante());
        System.out.println("Coord 5 está en el primer octante? " + c5.estaEnPrimerOctante());
        System.out.println("Coord 6 está en el primer octante? " + c6.estaEnPrimerOctante());
    }
}