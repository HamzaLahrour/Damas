package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola() {



    }


    public static void mostrarMenu (){
        System.out.println("*** Menu de Opciones ***");
        System.out.println("1- Crear dama por defecto.");
        System.out.println("2- Crear dama eligiendo el color.");
        System.out.println("3- Mover dama.");
        System.out.println("4- Mostrar informacion de la dama.");
        System.out.println("5- Salir.");

    }

    public static int elegirOpcionMenu (){

        int opcion=0;

        do {
            System.out.println("Elige una opcion del 1 al 5");
            opcion= Entrada.entero();
        }while (opcion<1 || opcion>5);


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

    public static Direccion mostrarMenuDirecciones (){

        int direccion1=0;

        do {

            System.out.println("*** Menu de direcciones ***");
            System.out.println("1-Noroeste");
            System.out.println("2-Noreste");
            System.out.println("3-Suroeste");
            System.out.println("4-Sureste");
            System.out.println("Elija una opcion del 1 al 4:");
            direccion1=Entrada.entero();

        }while (direccion1<1 || direccion1>4);

        if (direccion1==1){
            return Direccion.NOROESTE;
        }else if (direccion1==2){
            return Direccion.NORESTE;
        }else if (direccion1==3){
            return Direccion.SUROESTE;
        }else {
            return Direccion.SURESTE;
        }

    }

    public static int elegirPasos (){

        int pasosElegidos;

        System.out.println("Introduce los pasos, recuerda que si no es dama especial, solo puedes mover 1 paso.");
        pasosElegidos=Entrada.entero();

     return pasosElegidos;
    }

    public static void despedirse (){

        System.out.println("Gracias por usar el programa, nos vemos pronto. ");

    }


}
