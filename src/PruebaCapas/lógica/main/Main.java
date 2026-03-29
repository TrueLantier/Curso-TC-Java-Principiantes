package PruebaCapas.lógica.main;

import PruebaCapas.agendatelefónica.gui.UIAgenda;
import com.formdev.flatlaf.themes.*;

import javax.swing.*;

public class Main {
    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //JFrame.setDefaultLookAndFeelDecorated(true);
                    UIManager.setLookAndFeel(new FlatMacDarkLaf());
                    new UIAgenda();
                    //new Copiadora();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
}
