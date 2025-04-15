package org.example;

import org.example.model.Ejercicio5.Coord;
import org.example.util.CoordUtils.CoordUtils;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Coord c1 = new Coord(1, 2, 3);
        Coord c2 = new Coord(4, 6, 3);
        System.out.println("Distancia: " + CoordUtils.distancia(c1, c2));
        System.out.println("Iguales: " + CoordUtils.sonIguales(c1, c2));
        System.out.println("Proy eje X: " + CoordUtils.proyectarComponente(c1, 0));
    }
}