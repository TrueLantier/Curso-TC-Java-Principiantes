package PruebaCapas.lógica.main;

import PruebaCapas.agendatelefónica.gui.UIAgenda;
import PruebaCapas.gui.Copiadora;
import com.formdev.flatlaf.themes.*;
import com.formdev.flatlaf.*;
import javax.swing.*;

public class Main {
    static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    //FlatLightLaf.setup(); // o el tema que uses por defecto
                    JFrame.setDefaultLookAndFeelDecorated(true);
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
