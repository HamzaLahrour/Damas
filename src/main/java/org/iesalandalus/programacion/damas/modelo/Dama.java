package org.iesalandalus.programacion.damas.modelo;

import javax.naming.OperationNotSupportedException;

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

    public void mover (Direccion direccion,int pasos){

        if (direccion==null){

            throw new NullPointerException("ERROR:La dirreción es nula");

        }


        if (pasos>=1){
            if (esDamaEspecial==false){
                if (pasos!=1){
                    try {
                        throw new OperationNotSupportedException("ERROR:La dama no es especial, solo puedes mover un paso.");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }else {

            try {
                throw new OperationNotSupportedException("ERROR:No puede ser un paso negativo.");
            } catch (OperationNotSupportedException e) {
                throw new RuntimeException(e);
            }

        }

        if (color==Color.NEGRO){

            if (esDamaEspecial==false) {


                if (direccion == Direccion.SURESTE || direccion == Direccion.SUROESTE) {

                    try {
                        throw new OperationNotSupportedException("ERROR:La dama es negra,no puedes realizar movimientos al sureste o suroeste por que todavia no es una dama especial.");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }


                }


                if (posicion.getFila() == 8 || posicion.getFila() == 6 || posicion.getFila() == 4 || posicion.getFila() == 2) {



                    if (posicion.getColumna() == 'a' && direccion == Direccion.NOROESTE) {

                        try {
                            throw new OperationNotSupportedException("ERROR:No puedes mover la dama dirreccion noroeste por que se sale");
                        } catch (OperationNotSupportedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (posicion.getColumna() == 'a' && direccion == Direccion.NORESTE) {


                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('b');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'c' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('b');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'c' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('d');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'e' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('f');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'e' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('d');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'g' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('h');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'g' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('f');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }

                    if (posicion.getFila()==1){
                        esDamaEspecial=true;
                    }




                } else if (posicion.getFila() == 7 || posicion.getFila() == 5 || posicion.getFila() == 3) {

                    if (posicion.getColumna() == 'b' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('a');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);
                    }
                    if (posicion.getColumna() == 'b' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('c');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'd' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('e');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'd' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('c');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'f' && direccion == Direccion.NORESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('g');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'f' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('e');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'h' && direccion == Direccion.NOROESTE) {

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('g');

                        filaAlmacenam--;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna() == 'h' && direccion == Direccion.NORESTE) {

                        try {
                            throw new OperationNotSupportedException("ERROR:No puedes mover a la direccion noreste por que se sale del tablero.");
                        } catch (OperationNotSupportedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                } else if (posicion.getFila() == 1) {
                    if (direccion==Direccion.NOROESTE || direccion==Direccion.NORESTE){
                        try {
                            throw new OperationNotSupportedException("ERROR:No puedes mover hacia la direccion noroeste o noreste por que estas en la fila 1 y la casilla se sale del tablero");
                        } catch (OperationNotSupportedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }




            }else if (esDamaEspecial==true){

            //if (pasos==1){

                //if (posicion.getFila()==1 || posicion.getFila()==3 || posicion.getFila() )

            }
        }else if (color==Color.BLANCO){

            if (esDamaEspecial==false){

                if (direccion==Direccion.NOROESTE || direccion==Direccion.NORESTE){
                    try {
                        throw new OperationNotSupportedException("ERROR:No puedes mover una dama blanca direccion noroeste o noreste. Solo esta permitido para las damas especiales, por lo que las direcciones permitidas son suroeste y sureste.");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (posicion.getFila()==1 || posicion.getFila()==3 || posicion.getFila()==5 || posicion.getFila()==7){

                    if (posicion.getColumna()=='b' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('a');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='b' && direccion==Direccion.SURESTE){
                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('c');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);


                    }
                    if (posicion.getColumna()=='d' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('c');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='d' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('e');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='f' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('e');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='f' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('g');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='h' && direccion==Direccion.SURESTE){

                        try {
                            throw new OperationNotSupportedException("ERROR:No puedes mover la dama direccion sureste por que se sale.");
                        } catch (OperationNotSupportedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    if (posicion.getColumna()=='h' && direccion==Direccion.SUROESTE){
                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('g');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);
                    }

                    if (posicion.getFila()==8){

                        esDamaEspecial=true;

                        System.out.println("hola");
                    }


                } else if (posicion.getFila()==2 || posicion.getFila()==4 || posicion.getFila()==6) {

                    if (posicion.getColumna()=='a' && direccion==Direccion.SUROESTE){
                        try {
                            throw new OperationNotSupportedException("ERROR:No puedes mover la dama direccion suroeste por que se sale del tablero");
                        } catch (OperationNotSupportedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (posicion.getColumna()=='a' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('b');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='c' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('b');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);


                    }
                    if (posicion.getColumna()=='c' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('d');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='e' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('d');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='e' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('f');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);

                    }
                    if (posicion.getColumna()=='g' && direccion==Direccion.SUROESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('f');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);


                    }
                    if (posicion.getColumna()=='g' && direccion==Direccion.SURESTE){

                        int filaAlmacenam = posicion.getFila();
                        posicion.setColumna('h');

                        filaAlmacenam++;

                        posicion.setFila(filaAlmacenam);


                    }





                } else if (posicion.getFila()==8 && direccion==Direccion.SURESTE || direccion==Direccion.SUROESTE) {

                    try {
                        throw new OperationNotSupportedException("ERROR:Las direcciones sureste y suroeste en la fila 8 no son validas, por que se sale del tablero");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }





        }








        }








}





