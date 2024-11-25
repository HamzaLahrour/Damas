package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Posicion;

import java.util.concurrent.atomic.DoubleAdder;

 public class MainApp {

     Dama dama;
    int numero;

     private void ejecutarOpcion (int opcion1 ){


         switch (opcion1){

             case 1:
                 crearDamaDefecto();
                 break;
             case 2:
                 crearDamaColor();
                 break;
             case 3:
                 mover();
                 break;
             case 4:
                 mostrarDama();
                 break;
             case 5:
                 Consola.despedirse();
                 break;
         }




     }

     private void crearDamaDefecto (){



         dama=new Dama();
         System.out.println("Acabas de crear una dama por defecto que es de color blanco,para ver la informacion de la dama ingrese la opcion 4.");


     }

     private void crearDamaColor (){


         Color colorGuardado=Consola.elegirColor();
         Dama dama1 =new Dama();
         dama=new Dama(colorGuardado);

         System.out.println("La dama que acabas de crear es de color" + " " + dama.getColor() +  ", para ver la posicion ingrese la opcion 4.");
     }

     private void mover (){

         Direccion direccion1=Consola.mostrarMenuDirecciones();
          int pasosElegidos=Consola.elegirPasos();


         try {
             dama.mover(direccion1,pasosElegidos);
         } catch (OperationNotSupportedException e) {
             throw new RuntimeException(e);
         }

         System.out.println("Ahora la posicion actual despues de mover la dama es" + " " + dama.getPosicion());
     }


        private void mostrarDama(){

            if (dama==null){

                throw new NullPointerException("Aun no has creado ninguna dama, ingrese una opcion 1 o 2.");

            }



            System.out.println("El color de la dama es" + " " + dama.getColor());
            System.out.println("La posicion de la dama es" + " " + dama.getPosicion());

        }



     public static void main(String[] args) {



      MainApp menuDeLaApp = new MainApp();


      int opcionElegida=0;

      while (opcionElegida!=5){

          Consola.mostrarMenu();
          opcionElegida=Consola.elegirOpcionMenu();
          menuDeLaApp.ejecutarOpcion(opcionElegida);

      }


  }


}
