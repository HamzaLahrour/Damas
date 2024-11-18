package org.iesalandalus.programacion.damas.modelo;

public class Dama {



    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

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



}
