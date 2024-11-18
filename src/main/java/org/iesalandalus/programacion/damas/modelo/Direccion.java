package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {

    NORESTE("NORESTE"),
    SURESTE("SURESTE"),
    SUROESTE("SUROESTE"),
    NOROESTE("NOROESTE");

    String cadenaAMostrar;

    Direccion(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }
}

