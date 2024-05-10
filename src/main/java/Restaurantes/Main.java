package Restaurantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadenaRestaurantes cadena = new CadenaRestaurantes();

        // Agregamos algunos restaurantes de ejemplo
        cadena.agregarRestaurante(new Restaurante("Restaurante A", "Ciudad A", 10000));
        cadena.agregarRestaurante(new Restaurante("Restaurante B", "Ciudad B", 15000));
        cadena.agregarRestaurante(new Restaurante("Restaurante C", "Ciudad C", 20000));

        int opcion;
        do {
            System.out.println("----- Cadena de Restaurantes -----");
            System.out.println("1. Mostrar todos los restaurantes");
            System.out.println("2. Agregar restaurante");
            System.out.println("3. Buscar restaurante por nombre");
            System.out.println("4. Eliminar restaurante");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarRestaurantes(cadena);
                    break;
                case 2:
                    agregarRestaurante(scanner, cadena);
                    break;
                case 3:
                    buscarRestaurante(scanner, cadena);
                    break;
                case 4:
                    eliminarRestaurante(scanner, cadena);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
    }

    private static void mostrarRestaurantes(CadenaRestaurantes cadena) {
        System.out.println("----- Lista de Restaurantes -----");
        for (Restaurante r : cadena.getLocales()) {
            System.out.println("Nombre: " + r.getNombre() + ", Ciudad: " + r.getCiudad() + ", Ingresos: " + r.getIngresos());
        }
        System.out.println();
    }

    private static void agregarRestaurante(Scanner scanner, CadenaRestaurantes cadena) {
        System.out.println("Ingrese el nombre del restaurante:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la ciudad:");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese los ingresos del restaurante:");
        double ingresos = scanner.nextDouble();

        Restaurante restaurante = new Restaurante(nombre, ciudad, ingresos);
        cadena.agregarRestaurante(restaurante);
        System.out.println("Restaurante agregado exitosamente.\n");
    }

    private static void buscarRestaurante(Scanner scanner, CadenaRestaurantes cadena) {
        System.out.println("Ingrese el nombre del restaurante a buscar:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre = scanner.nextLine();
        Restaurante restaurante = cadena.buscarRestaurantePorNombre(nombre);
        if (restaurante != null) {
            System.out.println("Restaurante encontrado:");
            System.out.println("Nombre: " + restaurante.getNombre() + ", Ciudad: " + restaurante.getCiudad() + ", Ingresos: " + restaurante.getIngresos());
        } else {
            System.out.println("Restaurante no encontrado.");
        }
        System.out.println();
    }

    private static void eliminarRestaurante(Scanner scanner, CadenaRestaurantes cadena) {
        System.out.println("Ingrese el nombre del restaurante a eliminar:");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre = scanner.nextLine();
        Restaurante restaurante = cadena.buscarRestaurantePorNombre(nombre);
        if (restaurante != null) {
            cadena.eliminarRestaurante(restaurante);
            System.out.println("Restaurante eliminado exitosamente.\n");
        } else {
            System.out.println("Restaurante no encontrado.\n");
        }
    }
}

