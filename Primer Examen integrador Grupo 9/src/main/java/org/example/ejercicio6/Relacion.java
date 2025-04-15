package org.example.ejercicio6;

public class Relacion {
    private Tupla[] filas;
    private int cantidad;

    // Precondición: capacidadInicial > 0
    public Relacion(int capacidadInicial) {
        if (capacidadInicial <= 0)
            throw new RuntimeException("Capacidad inválida");
        filas = new Tupla[capacidadInicial];
        cantidad = 0;
    }

    // Precondición: la tupla no es nula y tiene el mismo tamaño que las ya agregadas (si existen)
    public void agregar(Tupla t) {
        if (t == null)
            throw new RuntimeException("Tupla nula");
        if (cantidad > 0 && t.tamanio() != filas[0].tamanio())
            throw new RuntimeException("Tupla incompatible");

        if (cantidad == filas.length) redimensionar();
        filas[cantidad] = t;
        cantidad++;
    }

    public int cantidadFilas() {
        return cantidad;
    }

    @Override
    public String toString() {
        StringBuilder r = new StringBuilder("[");
        for (int i = 0; i < cantidad; i++) {
            r.append(filas[i]);
            if (i < cantidad - 1) r.append(", ");
        }
        r.append("]");
        return r.toString();
    }

    private void redimensionar() {
        Tupla[] nuevo = new Tupla[filas.length * 2];
        for (int i = 0; i < filas.length; i++) {
            nuevo[i] = filas[i];
        }
        filas = nuevo;
    }
}
