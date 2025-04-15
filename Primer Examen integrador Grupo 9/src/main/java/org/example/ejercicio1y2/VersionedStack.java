package org.example.ejercicio1y2;

public class VersionedStack {
    private int[][] versiones;
    private int cantidadVersiones;
    private int versionActual;

    // Precondición: -
    // Postcondición: Crea una pila vacía con una versión inicial
    // Estrategia: se crea un arreglo de versiones de tamaño 1 y se guarda un arreglo vacío en la posición 0
    public VersionedStack() {
        versiones = new int[1][];
        versiones[0] = new int[0];
        cantidadVersiones = 1;
        versionActual = 0;
    }

    // Precondición: -
    // Postcondición: Apila un valor y genera una nueva versión
    // Estrategia: se copia el arreglo actual y se agrega el nuevo elemento al final
    public void apilar(int valor) {
        int[] actual = versiones[versionActual];
        int[] nueva = new int[actual.length + 1];
        for (int i = 0; i < actual.length; i++) {
            nueva[i] = actual[i];
        }
        nueva[actual.length] = valor;
        agregarVersion(nueva);
    }

    // Precondición: la pila actual no está vacía
    // Postcondición: desapila el tope y genera una nueva versión
    // Estrategia: se copia todo menos el ultimo elemento
    public void desapilar() {
        int[] actual = versiones[versionActual];
        if (actual.length == 0) throw new RuntimeException("Pila vacía");
        int[] nueva = new int[actual.length - 1];
        for (int i = 0; i < nueva.length; i++) {
            nueva[i] = actual[i];
        }
        agregarVersion(nueva);
    }

    // Precondición: 0 <= nro < cantidadVersiones
    // Postcondición: cambia la versión actual
    // Estrategia: se actualiza el índice versionActual
    public void irAVersion(int nro) {
        if (nro < 0 || nro >= cantidadVersiones) throw new RuntimeException("Versión inválida");
        versionActual = nro;
    }

    // Precondición: 0 <= nro < cantidadVersiones
    // Postcondición: borra una versión del historial
    // Estrategia: se crea un arreglo nuevo sin la versión eliminada
    public void borrarVersion(int nro) {
        if (nro < 0 || nro >= cantidadVersiones) throw new RuntimeException("Versión inválida");
        int[][] nuevo = new int[cantidadVersiones - 1][];
        int j = 0;
        for (int i = 0; i < cantidadVersiones; i++) {
            if (i != nro) {
                nuevo[j++] = versiones[i];
            }
        }
        versiones = nuevo;
        cantidadVersiones--;
        if (versionActual == nro) versionActual = cantidadVersiones - 1;
    }

    // Precondición: pila no vacía
    // Postcondición: devuelve el tope de la versión actual
    public int tope() {
        int[] actual = versiones[versionActual];
        if (actual.length == 0) throw new RuntimeException("Pila vacía");
        return actual[actual.length - 1];
    }

    // Precondición: -
    // Postcondición: devuelve el tamaño de la versión actual
    public int tamanio() {
        return versiones[versionActual].length;
    }

    // Método auxiliar
    private void agregarVersion(int[] nueva) {
        int[][] nuevo = new int[cantidadVersiones + 1][];
        for (int i = 0; i < cantidadVersiones; i++) {
            nuevo[i] = versiones[i];
        }
        nuevo[cantidadVersiones] = nueva;
        versiones = nuevo;
        versionActual = cantidadVersiones;
        cantidadVersiones++;
    }
} 
