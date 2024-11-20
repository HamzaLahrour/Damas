package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola() {



    }


    public static void mostrarMenu (){
        System.out.println("*** Menu de Opciones ***");
        System.out.println("1- Crear dama por defecto");
        System.out.println("2- Crear dama eligiendo el color");
        System.out.println("3- Mover dama");
        System.out.println("4- Salir");

    }

    public static int elegirOpcionMenu (){

        int opcion=0;

        do {
            System.out.println("Elige una opcion del 1 al 4");
            opcion= Entrada.entero();
        }while (opcion<1 || opcion>4);


     return opcion;
    }

    public static Color elegirColor (){

        int color1=0;



        do {

            System.out.println("*** Elige un color ***");
            System.out.println("1- BLANCO");
            System.out.println("2- NEGRO");

            System.out.println("Elija una opción del 1 al 2");
            color1=Entrada.entero();
        }while (color1!=1 && color1!=2);

        if (color1==1){

            return Color.BLANCO;
        }else {

            return Color.NEGRO;
        }


    }

}
