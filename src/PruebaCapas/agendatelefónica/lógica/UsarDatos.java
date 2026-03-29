package PruebaCapas.agendatelefónica.lógica;

import javax.swing.*;

public class UsarDatos {
    public static String[] contenidos;

    public static void guardarDatos(JTextField[] textos, int index) {
        contenidos = new String[textos.length];
        for (int i = 0; i < textos.length; i++) {
            Vectores.datos[i][index] = textos[i].getText();
        }

        // Verificación y otras cosas.

        Vectores.guardados[index] = true;
    }

    public static void mostrarDatos(JTextField[] textos, int index) {
        for (int i = 0; i < textos.length; i++) {
            textos[i].setText(Vectores.datos[i][index]);
        }
    }

    public static void limpiarDatos(JTextField[] textos) {
        for (JTextField texto: textos) {
            texto.setText("");
        }
    }
}
