package org.example.ejercicio5;

public class Coord {
    private final int[] componentes;

    // Precondición: arreglo no nulo de longitud 3
    // Postcondición: crea una coordenada (x, y, z)
    public Coord(int[] valores) {
        if (valores == null || valores.length != 3)
            throw new IllegalArgumentException("Una coordenada debe tener exactamente 3 componentes");

        componentes = new int[3];
        for (int i = 0; i < 3; i++) {
            componentes[i] = valores[i];
        }
    }

    // Precondición: 0 <= i <= 2
    // Postcondición: devuelve la i-ésima componente
    public int obtener(int i) {
        if (i < 0 || i > 2)
            throw new IndexOutOfBoundsException("Índice fuera de rango: debe estar entre 0 y 2");
        return componentes[i];
    }

    // Precondición: -
    // Postcondición: devuelve la coordenada como string
    public String toString() {
        return "(" + componentes[0] + ", " + componentes[1] + ", " + componentes[2] + ")";
    }
}
