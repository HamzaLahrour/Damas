package org.iesalandalus.programacion.damas.modelo;

public class Posicion {

    private int fila;
    private char columna;


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {

        if (fila>8 || fila<1){

            throw new IllegalArgumentException("ERROR: Las filas van del 1 al 8");
        }

        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {

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





}
