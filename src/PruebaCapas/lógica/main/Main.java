package PruebaCapas.lógica.main;

import PruebaCapas.agendatelefónica.gui.UIAgenda;
import PruebaCapas.copiadora.gui.Copiadora;
import PruebaCapas.desafíonavideño.gui.UIDesafíoNavideño;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import javax.swing.*;

public class Main {
    public static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //JFrame.setDefaultLookAndFeelDecorated(true);
                    UIManager.setLookAndFeel(new FlatMacDarkLaf());
                    //UIManager.setLookAndFeel(new FlatDarculaLaf());
                    //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    //new UIAgenda();
                    //new Copiadora();
                    new UIDesafíoNavideño();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
