package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Posicion;

import java.util.concurrent.atomic.DoubleAdder;

 public class MainApp {

  public static void main(String[] args) {


   //Dama dama = new Dama();

   //System.out.println(dama.getPosicion());

   Dama dama1 = new Dama(Color.NEGRO);

   System.out.println(dama1.getPosicion());
   System.out.println(dama1.getColor());

  //dama1.crearPosicionInicial(Color.NEGRO);

  }



}
