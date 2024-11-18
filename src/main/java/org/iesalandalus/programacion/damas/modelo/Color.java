package org.iesalandalus.programacion.damas.modelo;

public enum Color {

    BLANCO("BLANCO"),NEGRO("NEGRO");

    String cadenaAMostrar;

    Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return "Color{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }


}
