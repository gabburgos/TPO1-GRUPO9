package org.example.ejercicio6;


import org.example.ejercicio5.Tuple;

public class Relation {
    private Tuple[] filas;
    private int cantidad;

    /**
     * Crea una relación vacía con capacidad inicial.
     * Precondición: capacidad > 0.
     * Postcondición: se reserva espacio para futuras tuplas.
     * Estrategia: inicializa arreglo de tuplas y contador.
     */
    public Relation(int capacidadInicial) {
        if (capacidadInicial <= 0) throw new IllegalArgumentException("Capacidad inválida");
        filas = new Tuple[capacidadInicial];
        cantidad = 0;
    }

    /**
     * Agrega una tupla a la relación.
     * Precondición: t no es null y debe tener el mismo tamaño que las otras tuplas (si ya hay).
     * Postcondición: la tupla se agrega al final de la relación.
     * Estrategia: verificar compatibilidad y agregar; redimensionar si es necesario.
     */
    public void agregar(Tuple t) {
        if (t == null) throw new IllegalArgumentException("Tupla nula");
        if (cantidad > 0 && t.size() != filas[0].size()) {
            throw new IllegalArgumentException("Tupla incompatible");
        }
        if (cantidad == filas.length) {
            redimensionar();
        }
        filas[cantidad++] = t;
    }

    /**
     * Devuelve la cantidad de tuplas en la relación.
     * Precondición: ninguna.
     * Postcondición: no modifica el estado.
     */
    public int cantidadFilas() {
        return cantidad;
    }

    /**
     * Devuelve una representación en cadena de la relación.
     * Precondición: ninguna.
     * Postcondición: no modifica el estado.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cantidad; i++) {
            sb.append(filas[i]);
            if (i < cantidad - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // Método privado para agrandar el arreglo
    private void redimensionar() {
        Tuple[] nuevo = new Tuple[filas.length * 2];
        for (int i = 0; i < filas.length; i++) {
            nuevo[i] = filas[i];
        }
        filas = nuevo;
    }
}