package PruebaCapas.pruebas;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;

public class Pruebas {
    static void main() {
        String[][] matrizTemas = {
                {"FlatLaf Light",        FlatLightLaf.class.getName()},
                {"FlatLaf Dark",         FlatDarkLaf.class.getName()},
                {"FlatLaf IntelliJ",     FlatIntelliJLaf.class.getName()},
                {"FlatLaf Darcula",      FlatDarculaLaf.class.getName()},
                {"FlatMacLight",         FlatMacLightLaf.class.getName()},
                {"FlatMacDark",          FlatMacDarkLaf.class.getName()},
                {"System (Swing)",       UIManager.getSystemLookAndFeelClassName()}
        };

        System.out.println(matrizTemas.length);
    }
}
