package org.example.ejercicio5;

public class Tuple {
    private final int[] datos;

    // Precondición: arreglo no nulo y con al menos un valor
    // Postcondición: crea una tupla inmutable copiando los datos recibidos
    public Tuple(int[] valores) {
        if (valores == null || valores.length == 0)
            throw new RuntimeException("Tupla vacía o nula");

        datos = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            datos[i] = valores[i];
        }
    }

    // Precondición: índice válido
    // Postcondición: devuelve el valor en la posición i
    public int obtener(int i) {
        if (i < 0 || i >= datos.length)
            throw new RuntimeException("Índice fuera de rango");
        return datos[i];
    }

    // Precondición: -
    // Postcondición: devuelve la cantidad de componentes
    public int tamanio() {
        return datos.length;
    }

    // Precondición: -
    // Postcondición: devuelve la tupla como cadena
    public String toString() {
        String resultado = "(";
        for (int i = 0; i < datos.length; i++) {
            resultado += datos[i];
            if (i < datos.length - 1) resultado += ", ";
        }
        return resultado + ")";
    }
}

