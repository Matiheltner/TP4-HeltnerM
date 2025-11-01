package resolHeltnerM.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Prenda> catalogo = new ArrayList<>();

        catalogo.add(new Prenda("Camisa", 50000, "M"));
        catalogo.add(new Prenda("Pantalón", 85000, "L"));
        catalogo.add(new Prenda("Zapatillas", 120000, "38"));

        System.out.println("=== Catálogo de Prendas ===");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.print((i + 1) + ". ");
            catalogo.get(i).mostrarPrenda();
        }

        System.out.print("\nSeleccione una prenda por número: ");
        int opcion = sc.nextInt();
        Prenda seleccionada = catalogo.get(opcion - 1);

        System.out.print("¿Desea pagar al contado? (si/no): ");
        boolean contado = sc.next().equalsIgnoreCase("si");

        int cuotas = 0;
        if (!contado) {
            System.out.print("Ingrese cantidad de cuotas: ");
            cuotas = sc.nextInt();
        }

        System.out.print("¿Tiene un cupón de descuento? (si/no): ");
        boolean tieneCupon = sc.next().equalsIgnoreCase("si");

        Compra compra = new Compra(seleccionada, contado, cuotas, tieneCupon);
        compra.procesarCompra();
    }
}