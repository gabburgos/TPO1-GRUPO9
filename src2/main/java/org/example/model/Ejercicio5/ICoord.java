package org.example.model.Ejercicio5;

public interface ICoord {
    /**
     * Precondicion: el objeto Coord está inicializado.
     * Postcondicion: devuelve la componente correspondiente.
     * @return x
     */
    int getX();
    int getY();
    int getZ();

    /**
     * Precondicion: el objeto Coord está inicializado.
     * Postcondicion: cambia la componente especificada.
     * @param x
     */
    void setX(int x);
    void setY(int y);
    void setZ(int z);
}
