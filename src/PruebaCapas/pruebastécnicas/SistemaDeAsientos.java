package PruebaCapas.pruebastécnicas;

import java.util.Scanner;

public class SistemaDeAsientos {
    String[][] mapa = new String[10][10];
    Scanner sc;

    public SistemaDeAsientos() {
        cargarAsientos();
        System.out.println("*** Bienvenido al Sistema de reservas de asientos ***");
        elegir();
    }

    public void cargarAsientos() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapa[i][j] = "L";
            }
        }
    }

    public void elegir() {
        uno: do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1- Ver asientos disponibles.\n2- Reservar.\n3- Salir.");
            sc = new Scanner(System.in);
            int elección = sc.nextInt();

            switch (elección) {
                case 1:
                    mostrarAsientos();
                    break;
                case 2:
                    reservarAsiento();
                    break;
                case 3:
                    break uno;
                default:
                    System.out.println("Entrada incorrecta. Reintente.");
            }
            System.out.println();
        } while (true);
    }

    public void mostrarAsientos() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reservarAsiento() {
        do {
            System.out.println("Ingrese el número del asiento que desea reservar: 1-100");
            System.out.println("Pulse '0' para salir");
            //boolean verificar = sc.hasNextInt();
            int fila, columna;
            int asiento = sc.nextInt();
            if (asiento == 0) { break;}
            if (asiento < 1 || asiento > 100) {
                System.out.println("Número de asiento incorrecto. Reintente.");
                continue;
            }

            if (asiento == 100) {
                asignarAsiento(9, 9);
                continue;
            }

            if (asiento % 10 == 0) {
                fila = asiento / 10 - 1;
                columna = 9;
                asignarAsiento(fila, columna);
                continue;
            }

            fila = asiento / 10;
            columna = asiento % 10 - 1;
            asignarAsiento(fila, columna);
        } while (true);
    }

    public void asignarAsiento(int fila, int columna) {
        if (mapa[fila][columna].equals("X")) {
            System.out.println("Este asiento ya está reservado. Intente con otro.");
        }   else {
            mapa[fila][columna] = "X";
            System.out.println("Asiento reservado.");
        }
    }

    static void main() {
        SistemaDeAsientos sa = new SistemaDeAsientos();
    }
}
