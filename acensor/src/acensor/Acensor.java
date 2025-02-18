
package acensor;

import java.util.Scanner;


public class Acensor {

    public static void main(String[] args) {
      
           Acensor();  
    }
    public static void Acensor(){
        String pisos="10";
        try (Scanner TomarDatos = new Scanner(System.in)) {
            System.out.print("ingrese el piso al que desea ir:  ");
            int numero = TomarDatos.nextInt();
        }
        int numero;
        try (Scanner ProcesarDatos = new Scanner(System.in)) {
            numero = ProcesarDatos.nextInt();
        }
        if(numero==10){
            System.out.println("el piso es valido");
        }else{
            System.out.println("el piso es invalido");
        }
    }
  }
  