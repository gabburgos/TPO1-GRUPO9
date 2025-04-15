package org.example.util.CoordUtils;

import org.example.model.Ejercicio5.Coord;

public class CoordUtils {
    /**
     * Proyecta la i-ésima componente de una coordenada.
     * @param c Coordenada.
     * @param i Índice (0 = x, 1 = y, 2 = z).
     * @return Valor de la componente i.
     * Precondición: i ∈ {0,1,2}, c no es null.
     * Postcondición: devuelve c.x si i=0, c.y si i=1, c.z si i=2
     */
    public static int proyectarComponente(Coord c, int i) {
        if (c == null) {
            System.out.println("Error: Coordenada nula.");
            return -1;
        }

        switch (i) {
            case 0: return c.getX();
            case 1: return c.getY();
            case 2: return c.getZ();
            default:
                System.out.println("Error: índice inválido.");
                return -1;
        }
    }
    /**
     * Calcula la distancia euclídea entre dos coordenadas.
     * @param a Coordenada a.
     * @param b Coordenada b.
     * @return Distancia entre a y b.
     * Precondición: a y b no son null.
     * Postcondición: devuelve sqrt((x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2)
     */
    public static double distancia(Coord a, Coord b) {
        if (a == null || b == null) {
            System.out.println("Error: coordenadas nulas.");
            return -1;
        }

        int dx = b.getX() - a.getX();
        int dy = b.getY() - a.getY();
        int dz = b.getZ() - a.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    /**
     * Compara dos coordenadas para ver si son iguales.
     * @param a Coordenada a.
     * @param b Coordenada b.
     * @return true si a y b son iguales.
     * Precondición: a y b no son null.
     * Postcondición: devuelve true si todas las componentes son iguales.
     */
    public static boolean sonIguales(Coord a, Coord b) {
        if (a == null || b == null) {
            return false;
        }

        return a.getX() == b.getX() && a.getY() == b.getY() && a.getZ() == b.getZ();
    }

    /**
     * Verifica si una coordenada pertenece al primer octante (x > 0, y > 0, z > 0).
     * @param a Coordenada a evaluar.
     * @return true si pertenece al primer octante.
     * Precondición: a no es null.
     * Postcondición: devuelve true si x, y y z son mayores que 0.
     */
    public static boolean pertenecePrimerOctante(Coord a) {
        if (a == null) {
            return false;
        }

        return a.getX() > 0 && a.getY() > 0 && a.getZ() > 0;
    }
}
