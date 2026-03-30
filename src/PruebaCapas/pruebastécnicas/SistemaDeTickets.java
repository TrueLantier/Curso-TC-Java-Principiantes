package PruebaCapas.pruebastécnicas;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeTickets {
    static void main() {
    List<Ticket> listaTickets = new ArrayList<Ticket>();
    Ticket ticket1 = new Ticket(4, 1, 1, LocalDate.now(), LocalDate.now(), 200);
    Ticket ticket2 = new Ticket(10, 2, 2, LocalDate.now(), LocalDate.now(), 150);

    listaTickets.add(ticket1);
    listaTickets.add(ticket2);

    System.out.println(suma(listaTickets));

    verFilas(2, listaTickets);
    }

    public static double suma(List<Ticket> lista) {
        double suma = 0;
        for (Ticket ticket: lista) {
            suma += ticket.getPrecio();
        }
        return suma;
    }

    public static void verFilas(int número, List<Ticket> lista) {
        for (Ticket ticket: lista) {
            if (ticket.getNumFila() == número) {
                System.out.println(ticket.toString());
            }
        }
    }
}

class Ticket {
    private int numTicket;
    private int numFila;
    private int asiento;
    private LocalDate fechaCompra;
    private LocalDate fechaValidez;
    private double precio;

    public Ticket(int numTicket, int numFila, int asiento, LocalDate fechaCompra, LocalDate fechaValidez, double precio) {
        this.numTicket = numTicket;
        this.numFila = numFila;
        this.asiento = asiento;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public int getNumFila() {
        return numFila;
    }

    public void setNumFila(int numFila) {
        this.numFila = numFila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(LocalDate fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numTicket=" + numTicket +
                ", numFila=" + numFila +
                ", asiento=" + asiento +
                ", fechaCompra=" + fechaCompra +
                ", fechaValidez=" + fechaValidez +
                ", precio=" + precio +
                '}';
    }
}

class Cliente {
    private int id;
    private int ci;
    private String nombre;
    private String apellido;

    public Cliente(int id, int ci, String nombre, String apellido) {
        this.id = id;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", ci=" + ci +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
