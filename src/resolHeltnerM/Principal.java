package resolHeltnerM;

import resolHeltnerM.ejercicio1.Ejercicio1;
import resolHeltnerM.ejercicio2.Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nTP4 - Seleccione un ejercicio:");
            System.out.println("1. Tienda de Ropa");
            System.out.println("2. Agenda Telefónica");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> Ejercicio1.ejecutar();
                case 2 -> Ejercicio2.ejecutar();
                case 0 -> System.out.println("Fin del programa.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}