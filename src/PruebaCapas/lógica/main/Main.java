package PruebaCapas.lógica.main;

import PruebaCapas.gui.Pantalla;
import javax.swing.*;

public class Main {
    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pantalla();
            }
        });
    }
}
