package org.example.ejercicio1y2;

public class VersionedStack {
    private int[][] versiones;
    private int versionActual;

    public VersionedStack() {
        versiones = new int[1][];
        versiones[0] = new int[0];
        versionActual = 0;
    }

    /**
     * Agrega un nuevo elemento al tope de la pila y crea una nueva versión.
     * Precondición: ninguna.
     * Postcondición: la pila contiene el nuevo elemento y se agrega una nueva versión.
     * Estrategia: se copia el contenido de la versión actual y se le agrega el nuevo elemento.
     */
    public void push(int valor) {
        int[] anterior = versiones[versionActual];
        int[] nueva = new int[anterior.length + 1];
        for (int i = 0; i < anterior.length; i++) {
            nueva[i] = anterior[i];
        }
        nueva[anterior.length] = valor;
        agregarVersion(nueva);
    }

    /**
     * Elimina el último elemento de la pila y crea una nueva versión.
     * Precondición: la pila no debe estar vacía.
     * Postcondición: se crea una nueva versión sin el último elemento.
     * Estrategia: se copia el contenido actual menos el último elemento.
     */
    public void pop() {
        int[] anterior = versiones[versionActual];
        if (anterior.length == 0) throw new RuntimeException("La pila está vacía");

        int[] nueva = new int[anterior.length - 1];
        for (int i = 0; i < nueva.length; i++) {
            nueva[i] = anterior[i];
        }
        agregarVersion(nueva);
    }

    /**
     * Borra una versión específica del historial de versiones.
     * Precondición: el número de versión debe ser válido.
     * Postcondición: la versión es eliminada del arreglo.
     * Estrategia: se crea un nuevo arreglo de versiones sin la versión eliminada.
     */
    public void borrarVersion(int numeroVersion) {
        if (numeroVersion < 0 || numeroVersion >= versiones.length)
            throw new RuntimeException("Versión inválida");

        int nuevaLongitud = versiones.length - 1;
        int[][] nuevo = new int[nuevaLongitud][];
        int j = 0;
        for (int i = 0; i < versiones.length; i++) {
            if (i != numeroVersion) {
                nuevo[j++] = versiones[i];
            }
        }
        versiones = nuevo;
        if (versionActual == numeroVersion) versionActual = versiones.length - 1;
    }

    /**
     * Cambia la versión actual a una versión anterior.
     * Precondición: el número de versión debe ser válido.
     * Postcondición: se actualiza el puntero a la versión actual.
     * Estrategia: acceso directo al índice del arreglo de versiones.
     */
    public void irAVersion(int numeroVersion) {
        if (numeroVersion < 0 || numeroVersion >= versiones.length)
            throw new RuntimeException("Versión inválida");
        versionActual = numeroVersion;
    }

    /**
     * Devuelve el último elemento de la pila actual sin modificarla.
     * Precondición: la pila no debe estar vacía.
     * Postcondición: no modifica el estado de la pila.
     * Estrategia: acceso al último índice del arreglo de la versión actual.
     */
    public int tope() {
        int[] actual = versiones[versionActual];
        if (actual.length == 0) throw new RuntimeException("La pila está vacía");
        return actual[actual.length - 1];
    }

    /**
     * Devuelve la cantidad de elementos en la versión actual de la pila.
     * Precondición: ninguna.
     * Postcondición: no modifica el estado.
     * Estrategia: se usa la longitud del arreglo de la versión actual.
     */
    public int tamanio() {
        return versiones[versionActual].length;
    }

    /**
     * Devuelve la cantidad total de versiones almacenadas.
     * Precondición: ninguna.
     * Postcondición: no modifica el estado.
     * Estrategia: se usa la longitud del arreglo de versiones.
     */
    public int cantidadDeVersiones() {
        return versiones.length;
    }

    /**
     * Devuelve el índice de la versión actual.
     * Precondición: ninguna.
     * Postcondición: no modifica el estado.
     * Estrategia: retorna directamente la variable versionActual.
     */
    public int getVersionActual() {
        return versionActual;
    }

    // Método auxiliar para agregar una nueva versión
    private void agregarVersion(int[] nueva) {
        int[][] nuevo = new int[versiones.length + 1][];
        for (int i = 0; i < versiones.length; i++) {
            nuevo[i] = versiones[i];
        }
        nuevo[versiones.length] = nueva;
        versiones = nuevo;
        versionActual = versiones.length - 1;
    }
}