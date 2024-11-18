package org.iesalandalus.programacion.damas.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;


    public int getFila() {
        return fila;
    }

    private void setFila(int fila) {

        if (fila>8 || fila<1){

            throw new IllegalArgumentException("ERROR: Las filas van del 1 al 8");
        }

        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    private void setColumna(char columna) {

        switch (columna){
            case 'a':
                this.columna = columna;
                break;
            case 'b':
                this.columna = columna;
                break;
            case 'c':
                this.columna = columna;
                break;
            case 'd':
                this.columna = columna;
                break;
            case 'e':
                this.columna = columna;
                break;
            case 'f':
                this.columna = columna;
                break;
            case 'g':
                this.columna = columna;
                break;
            case 'h':
                this.columna = columna;
                break;
            default:
                throw new IllegalArgumentException("ERORR:Las columnas van de la 'a' a la 'h', no se permiten mayusculas");
        }


    }



    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);

    }

    public Posicion(Posicion posicion){

        setFila(posicion.fila);
        setColumna(posicion.columna);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    @Override
    public String toString() {
        return "Posicion" + " " +
                "fila=" + fila +
                ", columna=" + " " + columna ;
    }
}
