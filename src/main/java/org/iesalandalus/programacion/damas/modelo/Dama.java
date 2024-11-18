package org.iesalandalus.programacion.damas.modelo;

public class Dama {



    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;


    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {

        switch (color){

            case NEGRO:
                this.color = color;
                break;
            case BLANCO:
                this.color = color;
                break;
            default:
                throw new IllegalArgumentException("ERROR:El color no existe, solo es blanco o negro");


        }



        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {

        if (posicion==null){

            throw new NullPointerException("ERROR: La variable no apunta a ningun objeto en memoria");
        }

        this.posicion = posicion;
    }

    public Dama (){

        this.color=Color.BLANCO;


        int fila = (int) (Math.random()*3) + 1;
        int columnaRandom =(int) (Math.random()*4)+1;
        char columna=' ';


        switch (fila){

            case 1:
               switch (columnaRandom){

                   case 1:
                       columna='b';
                       break;

                   case 2:
                       columna='d';
                   break;
                   case 3:
                       columna='f';
                       break;
                   case 4:
                       columna='h';
                       break;
                }
            break;
            case 2:
                switch (columnaRandom){

                    case 1:
                        columna='a';
                        break;

                    case 2:
                        columna='c';
                        break;
                    case 3:
                        columna='e';
                        break;
                    case 4:
                        columna='g';
                        break;
                }
            break;
            case 3:
                switch (columnaRandom){

                    case 1:
                        columna='b';
                        break;

                    case 2:
                        columna='d';
                        break;
                    case 3:
                        columna='f';
                        break;
                    case 4:
                        columna='h';

                }


        }

        Posicion posicion1 = new Posicion(fila,columna);

        this.posicion = posicion1;

    }

    public Dama(Color color) {
        this.color = color;
        this.posicion=crearPosicionInicial(color);

    }

    private Posicion crearPosicionInicial (Color color){



       if (color==Color.BLANCO){

           int fila = (int) (Math.random()*3) + 1;
           int columnaRandom =(int) (Math.random()*4)+1;
           char columna=' ';


           switch (fila){

               case 1:
                   switch (columnaRandom){

                       case 1:
                           columna='b';
                           break;

                       case 2:
                           columna='d';
                           break;
                       case 3:
                           columna='f';
                           break;
                       case 4:
                           columna='h';
                           break;
                   }
                   break;
               case 2:
                   switch (columnaRandom){

                       case 1:
                           columna='a';
                           break;

                       case 2:
                           columna='c';
                           break;
                       case 3:
                           columna='e';
                           break;
                       case 4:
                           columna='g';
                           break;
                   }
                   break;
               case 3:
                   switch (columnaRandom){

                       case 1:
                           columna='b';
                           break;

                       case 2:
                           columna='d';
                           break;
                       case 3:
                           columna='f';
                           break;
                       case 4:
                           columna='h';

                   }


           }

           Posicion posicion3 = new Posicion(fila,columna);
           return posicion3;

       }else{

           int max=8;
           int min=6;

           int fila = (int) (Math.random() * ( max - min + 1)) + min;
           int columnaRandom =(int) (Math.random()*4)+1;
           char columna=' ';



           System.out.println(columnaRandom);

           switch (fila){

               case 6:
                   switch (columnaRandom){

                       case 1:
                           columna='a';
                           break;

                       case 2:
                           columna='c';
                           break;
                       case 3:
                           columna='e';
                           break;
                       case 4:
                           columna='g';
                           break;
                   }
                   break;
               case 7:
                   switch (columnaRandom){

                       case 1:
                           columna='b';
                           break;

                       case 2:
                           columna='d';
                           break;
                       case 3:
                           columna='f';
                           break;
                       case 4:
                           columna='h';
                           break;
                   }
                   break;
               case 8:
                   switch (columnaRandom){

                       case 1:
                           columna='a';
                           break;

                       case 2:
                           columna='c';
                           break;
                       case 3:
                           columna='e';
                           break;
                       case 4:
                           columna='g';

                   }


           }

            Posicion posicion2 = new Posicion(fila,columna);


           return posicion2;

       }


    }




}
