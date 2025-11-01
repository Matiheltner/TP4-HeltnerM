package resolHeltnerM.ejercicio2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
    private int capacidad;

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        contactos = new ArrayList<>();
    }

    public Agenda() {
        this(10);
    }

    public void aniadirContacto(Contacto c) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se puede añadir el contacto.");
        } else if (contactos.contains(c)) {
            System.out.println("Ya existe un contacto con ese número.");
        } else {
            contactos.add(c);
            System.out.println("Contacto añadido correctamente.");
        }
    }

    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Contactos en la agenda:");
            for (Contacto c : contactos) {
                System.out.println("- " + c);
            }
        }
    }

    public void buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono de " + nombre + ": " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto para eliminar.");
        }
    }

    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }

    public int espacioLibre() {
        return capacidad - contactos.size();
    }
}