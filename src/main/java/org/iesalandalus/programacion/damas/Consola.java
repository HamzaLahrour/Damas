package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    public Consola() {



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

//    public static Color elegirOpcion (){
//
//
//
//        return
//    }

}
