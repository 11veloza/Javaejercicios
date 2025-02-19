package ejercicios.java;

import java.util.Scanner;

public class Cajero_Automatico {
  
    public static void main(String[] args) {
        cajero();
    }

    public static void cajero() {
        double saldo = 1000.00; 
        double monto = 0.0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el monto que desea retirar: ");
            monto = scanner.nextDouble();  
            while (monto > saldo) {
                System.out.println("El monto es mayor al saldo disponible. Error.");
                System.out.print("Ingrese un monto que no supere el saldo disponible: ");
                monto = scanner.nextInt();  
            }
            saldo -= monto; // Restamos el monto al saldo.
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
            
        }
    }

}
