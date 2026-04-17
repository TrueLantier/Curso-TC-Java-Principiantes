package PruebaCapas.administradorestacionamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministrarEstacionamiento {
    private List<Cliente> listaClientes = new ArrayList<>();
    private int entero;
    private double ingresos = 0;
    private Scanner sc = new Scanner(System.in);
    private int[] estacionamientos = new int[10];

    public AdministrarEstacionamiento() {
        bienvenida();
        operación();
    }

    private void bienvenida() {
        System.out.println("\t***Bienvenido al Administrador de estacionamiento.***");
    }

    private void agregarCliente() {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la patente del vehículo: ");
        String patente = sc.nextLine();

        System.out.println("Ingrese el tipo de estacionamiento: -->  1-10  <--");
        System.out.println("Por hora: 3 USD");
        System.out.println("Media jornada = 15 USD con 5% de descuento.");
        System.out.println("Jornada completa = 30 USD con 10% de descuento.");

        if (verificarEntrada(1, 10)) {
            return;
        }

        Cliente cliente = new Cliente(nombre, patente);
        cliente.setFactura(asignarFactura(entero));
        ingresos += cliente.getFactura();
        listaClientes.add(cliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    private double asignarFactura(int factura) {
        if (factura == 5) {
            estacionamientos[4]++;
            return 15 - (15.0 * 0.05);
        }
        if (factura == 10) {
            estacionamientos[9]++;
            return 27;
        }

        estacionamientos[factura-1]++;
        return factura * 3;
    }

    private void verInfoCliente() {
        System.out.println("¿Qué información desea ver?");
        System.out.println("1- Ver información de todos los clientes.");
        System.out.println("2- Buscar información de un cliente en específico.");

        if (verificarEntrada(1, 2)) {
            return;
        }

        dos: switch (entero) {
            case 1:
                for (Cliente cliente: listaClientes) {
                    System.out.println(cliente);
                }
                break;
            case 2:
                System.out.println("Ingrese el nombre del cliente que desea buscar información:");
                String nombre = sc.nextLine();
                for (Cliente cliente: listaClientes) {
                    if (cliente.getNombreCliente().equals(nombre)) {
                        System.out.println(cliente);
                        break dos;
                    }
                }
                System.out.println("No existe cliente con ese nombre.");
                break;
        }
    }

    private void operación() {
        uno: while (true) {
            System.out.println("\n¿Qué operación desea realizar?");
            System.out.println("1- Agregar cliente.\n2-Consultar información de cliente.\n3- Salir." +
                    "\n4- Ver información de los estacionamientos.");

            if (verificarEntrada(1, 4)) {
                continue ;
            }

            switch (entero) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    verInfoCliente();
                    break;
                case 3:
                    break uno;
                case 4:
                    verInfoEstacionamientos();
                    break ;
            }
        }
    }

    // true si HAY error.
    private boolean verificarEntrada(int rangoBajo, int rangoAlto) {
        try {
            entero = Integer.parseInt(sc.nextLine());
            if (entero < rangoBajo || entero > rangoAlto) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta. Reintente.");
            return true;
        } catch (IllegalArgumentException ex) {
            System.out.println("Tipo de operación no soportado. Reintente.");
            return true;
        }
        return false;
    }

    private void verInfoEstacionamientos() {
        System.out.println("Cantidad de estacionamientos por hora:");
        for (int i = 0; i < estacionamientos.length; i++) {
            if (i == 0) {
                System.out.println((i+1) + " hora: " + estacionamientos[0]);
                continue;
            }
            if ((i != 4) && (i != 9)) {
                System.out.println((i+1) + " horas: " + estacionamientos[i]);
                continue;
            }
            if (i == 4) {
                System.out.println((i+1) + " Media jornada: " + estacionamientos[i]);
                continue;
            }
            System.out.println((i+1) + " Jornada completa: " + estacionamientos[i]);
        }
        System.out.println("Ingresos totales: " + ingresos);
    }
}
