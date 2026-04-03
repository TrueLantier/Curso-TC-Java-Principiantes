package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelButton extends JPanel implements ActionListener {
    private JButton buttonUno, buttonDos, buttonTres, buttonCuatro, buttonCinco, buttonSeis, buttonSiete,
    buttonOcho;
    private ImageIcon iconImage;
    private String[] rutaFotos = {
            "src/PruebaCapas/resources/images/dream-realm.png",
            "src/PruebaCapas/resources/images/the-spell.png",
            "src/PruebaCapas/resources/images/nephis-saint.png",
            "src/PruebaCapas/resources/images/nightmare-creature.png",
            "src/PruebaCapas/resources/images/straw-hat.png",
            "src/PruebaCapas/resources/images/jolly-roger.png",
            "src/PruebaCapas/resources/images/thousand-sunny.png",
            "src/PruebaCapas/resources/images/haki.png",
            ""
    };

    public PanelButton() {
        setLayout(new MigLayout("insets 0, gap 40 10 10 10, fillx"));

        iconImage = ponerFoto(rutaFotos[0], 40);
        buttonUno = new JButton(iconImage);
        buttonUno.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[1], 40);
        buttonDos = new JButton(iconImage);
        buttonDos.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[2], 40);
        buttonTres = new JButton(iconImage);
        buttonTres.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[3], 40);
        buttonCuatro = new JButton(iconImage);
        buttonCuatro.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[4], 40);
        buttonCinco = new JButton(iconImage);
        buttonCinco.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[5], 40);
        buttonSeis = new JButton(iconImage);
        buttonSeis.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[6], 40);
        buttonSiete = new JButton(iconImage);
        buttonSiete.addActionListener(this);

        iconImage = ponerFoto(rutaFotos[7], 40);
        buttonOcho = new JButton(iconImage);
        buttonOcho.addActionListener(this);

        add(new JSeparator(), "growx, span, wrap");

        add(buttonCinco, "gapleft 70");
        add(buttonSeis);
        add(buttonSiete);
        add(buttonOcho, "wrap");

        add(new JSeparator(), "growx, span, wrap");

        add(buttonUno, "gapleft 70");
        add(buttonDos);
        add(buttonTres);
        add(buttonCuatro, "wrap");

        add(new JSeparator(), "growx, span, wrap");
    }

    private ImageIcon ponerFoto(String ruta, int tamaño) {
        ImageIcon icon = new ImageIcon(ruta);
        Image imagen = icon.getImage().getScaledInstance(tamaño, tamaño, Image.SCALE_SMOOTH);
        icon = new ImageIcon(imagen);
        return icon;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
