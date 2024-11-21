package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Posicion;

import java.util.concurrent.atomic.DoubleAdder;

 public class MainApp {

  public static void main(String[] args) {




    //Consola.mostrarMenu();
    //Consola.elegirOpcionMenu();


    //Consola.elegirColor();


      Direccion direccion1=Consola.mostrarMenuDirecciones();

      Dama dama1= new Dama(Color.BLANCO);



   System.out.println(dama1.getPosicion());
      try {
          dama1.mover(direccion1,1);
      } catch (OperationNotSupportedException e) {
          throw new RuntimeException(e);
      }
      System.out.println(dama1.getPosicion());















  }



}
