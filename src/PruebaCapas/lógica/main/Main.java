package PruebaCapas.lógica.main;

import PruebaCapas.gui.Pantalla;
import com.formdev.flatlaf.themes.*;
import com.formdev.flatlaf.*;

import javax.swing.*;

public class Main {
    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //UIManager.setLookAndFeel(new FlatMacDarkLaf());
                    //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Del sistema operativo
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); // Feo
                    new Pantalla();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
