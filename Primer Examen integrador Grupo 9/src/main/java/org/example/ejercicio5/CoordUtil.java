package org.example.ejercicio5;

public class CoordUtil {

    // Precondición: coord no nulo, 0 <= i <= 2
    // Postcondición: devuelve la i-ésima componente de la coordenada
    public static int proyectarComponente(Coord coord, int i) {
        return coord.obtener(i);
    }

    // Precondición: coord1 y coord2 no nulos
    // Postcondición: devuelve la distancia euclideana entre dos coordenadas
    public static double distancia(Coord coord1, Coord coord2) {
        if (coord1 == null || coord2 == null)
            throw new IllegalArgumentException("Coordenadas nulas no válidas");

        int dx = coord1.obtener(0) - coord2.obtener(0);
        int dy = coord1.obtener(1) - coord2.obtener(1);
        int dz = coord1.obtener(2) - coord2.obtener(2);

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Precondición: coord1 y coord2 no nulos
    // Postcondición: devuelve true si ambas coordenadas tienen los mismos valores
    public static boolean sonIguales(Coord coord1, Coord coord2) {
        if (coord1 == null || coord2 == null)
            return false;
        for (int i = 0; i < 3; i++) {
            if (coord1.obtener(i) != coord2.obtener(i))
                return false;
        }
        return true;
    }

    // Precondición: coord no nula
    // Postcondición: devuelve true si la coordenada está en el primer octante (x, y, z > 0)
    public static boolean enPrimerOctante(Coord coord) {
        if (coord == null)
            throw new IllegalArgumentException("Coordenada nula");

        return coord.obtener(0) > 0 && coord.obtener(1) > 0 && coord.obtener(2) > 0;
    }
}
