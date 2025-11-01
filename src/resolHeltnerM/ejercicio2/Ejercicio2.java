package resolHeltnerM.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            System.out.println("\n===== AGENDA TELEFÓNICA =====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Ver si existe un contacto");
            System.out.println("3. Listar todos los contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Ver si la agenda está llena");
            System.out.println("7. Ver espacio libre");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    agenda.aniadirContacto(new Contacto(nombre, telefono));
                    break;
                case 2:
                    System.out.print("Teléfono del contacto: ");
                    String tel = sc.nextLine();
                    boolean existe = agenda.existeContacto(new Contacto("", tel));
                    System.out.println("¿Existe? " + (existe ? "Sí" : "No"));
                    break;
                case 3:
                    agenda.listarContactos();
                    break;
                case 4:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    agenda.buscaContacto(buscar);
                    break;
                case 5:
                    System.out.print("Teléfono del contacto a eliminar: ");
                    String telEliminar = sc.nextLine();
                    agenda.eliminarContacto(new Contacto("", telEliminar));
                    break;
                case 6:
                    System.out.println("¿Agenda llena? " + (agenda.agendaLlena() ? "Sí" : "No"));
                    break;
                case 7:
                    System.out.println("Espacio libre: " + agenda.espacioLibre());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}