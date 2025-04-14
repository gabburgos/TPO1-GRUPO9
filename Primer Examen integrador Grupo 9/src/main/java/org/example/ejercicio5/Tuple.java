package org.example.ejercicio5;

public class Tuple {
    private final int[] datos;

    /**
     * Crea una tupla inmutable con los valores dados.
     * Precondición: el arreglo no debe ser null ni vacío.
     * Postcondición: se crea una copia inmutable de los datos.
     */
    public Tuple(int[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("La tupla debe tener al menos un valor");
        }
        this.datos = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            this.datos[i] = valores[i];
        }
    }

    /**
     * Devuelve el valor en la posición i.
     * Precondición: 0 <= i < size().
     * Postcondición: no modifica la tupla.
     */
    public int get(int i) {
        if (i < 0 || i >= datos.length) throw new IndexOutOfBoundsException("Índice inválido");
        return datos[i];
    }

    /**
     * Devuelve el tamaño (número de componentes) de la tupla.
     */
    public int size() {
        return datos.length;
    }

    /**
     * Representación en cadena de la tupla.
     * Ejemplo: (1, 2, 3)
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < datos.length; i++) {
            sb.append(datos[i]);
            if (i < datos.length - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }

    // === Clase auxiliar con método project ===
    public static class Projector {
        /**
         * Devuelve el valor proyectado de una tupla en la posición i.
         * Precondición: 0 <= i < t.size()
         * Postcondición: no modifica la tupla
         */
        public static int project(Tuple t, int i) {
            return t.get(i);
        }
    }
}
