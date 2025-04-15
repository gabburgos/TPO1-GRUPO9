package org.example.ejercicio6;

// Representa una tupla genérica de objetos
public class Tupla {
    private final Object[] datos;

    // Precondición: arreglo no nulo y con al menos un valor
    // Postcondición: crea una tupla inmutable copiando los datos recibidos
    public Tupla(Object[] valores) {
        if (valores == null || valores.length == 0)
            throw new RuntimeException("Tupla vacía o nula");

        datos = new Object[valores.length];
        for (int i = 0; i < valores.length; i++) {
            datos[i] = valores[i];
        }
    }

    // Precondición: índice válido
    // Postcondición: devuelve el valor en la posición i
    public Object obtener(int i) {
        if (i < 0 || i >= datos.length)
            throw new RuntimeException("Índice fuera de rango");
        return datos[i];
    }

    // Postcondición: devuelve el tamaño de la tupla
    public int tamanio() {
        return datos.length;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("(");
        for (int i = 0; i < datos.length; i++) {
            resultado.append(datos[i]);
            if (i < datos.length - 1) resultado.append(", ");
        }
        resultado.append(")");
        return resultado.toString();
    }
}
