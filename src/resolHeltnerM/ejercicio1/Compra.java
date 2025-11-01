package resolHeltnerM.ejercicio1;

public class Compra {
    private Prenda prenda;
    private boolean pagoContado;
    private int cuotas;
    private boolean cupon;

    public Compra(Prenda prenda, boolean pagoContado, int cuotas, boolean cupon) {
        this.prenda = prenda;
        this.pagoContado = pagoContado;
        this.cuotas = cuotas;
        this.cupon = cupon;
    }

    public void procesarCompra() {
        double precioBase = prenda.getPrecioBase();
        double descuentoContado = 0;
        double descuentoCupon = 0;
        double recargoCuotas = 0;
        double precioFinal;

        if (pagoContado) {
            descuentoContado = precioBase * 0.15;
            precioFinal = precioBase - descuentoContado;

            if (cupon) {
                descuentoCupon = precioFinal * 0.10;
                precioFinal -= descuentoCupon;
            }
        } else {

            if (cuotas > 12) {
                recargoCuotas = precioBase * 0.12;
            } else if (cuotas > 6) {
                recargoCuotas = precioBase * 0.08;
            } else if (cuotas > 3) {
                recargoCuotas = precioBase * 0.05;
            }

            if (cupon) {
                descuentoCupon = precioBase * 0.10;
            }

            precioFinal = precioBase + recargoCuotas - descuentoCupon;
        }

        System.out.println("\n----- DETALLE DE LA COMPRA -----");
        System.out.println("Prenda elegida: " + prenda.getTipo() + " | Talle: " + prenda.getTalle());
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Método de pago: " + (pagoContado ? "Contado" : "Cuotas"));

        if (pagoContado) {
            System.out.println("Descuento por pago al contado: $" + descuentoContado);
        } else {
            System.out.println("Cantidad de cuotas: " + cuotas);
            System.out.println("Recargo por pago en cuotas: $" + recargoCuotas);
        }

        if (cupon) {
            System.out.println("Descuento aplicado por cupón: $" + descuentoCupon);
        }

        System.out.printf("Precio final a pagar: $%.2f%n", precioFinal);
        System.out.println("----------------------------------\n");
    }
}