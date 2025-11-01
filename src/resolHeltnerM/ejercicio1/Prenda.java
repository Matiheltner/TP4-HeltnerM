package resolHeltnerM.ejercicio1;

public class Prenda {
    private String tipo;
    private double precioBase;
    private String talle;

    public Prenda(String tipo, double precioBase, String talle) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTalle() {
        return talle;
    }

    public void mostrarPrenda() {
        System.out.println("Tipo: " + tipo + " | Talle: " + talle + " | Precio base: $" + precioBase);
    }
}