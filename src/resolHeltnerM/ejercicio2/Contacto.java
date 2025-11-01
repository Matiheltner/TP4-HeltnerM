package resolHeltnerM.ejercicio2;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto c = (Contacto) o;
        return telefono.equals(c.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }

    @Override
    public String toString() {
        return nombre + " - " + telefono;
    }
}