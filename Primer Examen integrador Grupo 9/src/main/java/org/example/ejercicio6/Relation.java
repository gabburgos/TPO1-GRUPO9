/*
package org.example.ejercicio6;



import org.example.ejercicio5.Tuple;

public class Relacion {
    private Tuple[] filas;
    private int cantidad;

    // Precondición: capacidadInicial > 0
    // Postcondición: crea una relación vacía con espacio reservado
    public Relacion(int capacidadInicial) {
        if (capacidadInicial <= 0)
            throw new RuntimeException("Capacidad inválida");
        filas = new Tupla[capacidadInicial];
        cantidad = 0;
    }

    // Precondición: la tupla no es nula y tiene el mismo tamaño que las ya agregadas (si existen)
    // Postcondición: agrega una tupla a la relación
    public void agregar(Tupla t) {
        if (t == null)
            throw new RuntimeException("Tupla nula");
        if (cantidad > 0 && t.tamanio() != filas[0].tamanio())
            throw new RuntimeException("Tupla incompatible");

        if (cantidad == filas.length) redimensionar();
        filas[cantidad] = t;
        cantidad++;
    }

    // Precondición: -
    // Postcondición: devuelve cuántas tuplas tiene la relación
    public int cantidadFilas() {
        return cantidad;
    }

    // Precondición: -
    // Postcondición: devuelve una cadena con todas las tuplas
    public String toString() {
        String r = "[";
        for (int i = 0; i < cantidad; i++) {
            r += filas[i];
            if (i < cantidad - 1) r += ", ";
        }
        return r + "]";
    }

    // Redimensiona el arreglo al doble de tamaño
    private void redimensionar() {
        Tupla[] nuevo = new Tupla[filas.length * 2];
        for (int i = 0; i < filas.length; i++) {
            nuevo[i] = filas[i];
        }
        filas = nuevo;
    }
}
 */