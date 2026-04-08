package PruebaCapas.desafíonavideño.gui;

import PruebaCapas.desafíonavideño.logic.AdivinanzasLógica;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelButton extends JPanel {
    public JButton buttonUno, buttonDos, buttonTres, buttonCuatro, buttonCinco, buttonSeis, buttonSiete,
    buttonOcho;
    public ImageIcon iconImage;
    public AdivinanzasLógica al = new AdivinanzasLógica();
    public String[] rutaFotos = {
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

    public PanelButton(ActionListener principal) {
        setLayout(new MigLayout("insets 0, gap 40 10 10 10, fillx"));

        iconImage = ponerFoto(rutaFotos[0], 40);
        buttonUno = new JButton(iconImage);
        buttonUno.setActionCommand("Dream");
        buttonUno.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[1], 40);
        buttonDos = new JButton(iconImage);
        buttonDos.setActionCommand("Spell");
        buttonDos.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[2], 40);
        buttonTres = new JButton(iconImage);
        buttonTres.setActionCommand("Nephis");
        buttonTres.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[3], 40);
        buttonCuatro = new JButton(iconImage);
        buttonCuatro.setActionCommand("Creature");
        buttonCuatro.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[4], 40);
        buttonCinco = new JButton(iconImage);
        buttonCinco.setActionCommand("Luffy");
        buttonCinco.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[5], 40);
        buttonSeis = new JButton(iconImage);
        buttonSeis.setActionCommand("Mugiwara");
        buttonSeis.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[6], 40);
        buttonSiete = new JButton(iconImage);
        buttonSiete.setActionCommand("Sunny");
        buttonSiete.addActionListener(principal);

        iconImage = ponerFoto(rutaFotos[7], 40);
        buttonOcho = new JButton(iconImage);
        buttonOcho.setActionCommand("Haki");
        buttonOcho.addActionListener(principal);

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

    public JButton getButtonUno() {
        return buttonUno;
    }

    public void setButtonUno(JButton buttonUno) {
        this.buttonUno = buttonUno;
    }

    public JButton getButtonDos() {
        return buttonDos;
    }

    public void setButtonDos(JButton buttonDos) {
        this.buttonDos = buttonDos;
    }

    public JButton getButtonTres() {
        return buttonTres;
    }

    public void setButtonTres(JButton buttonTres) {
        this.buttonTres = buttonTres;
    }

    public JButton getButtonCuatro() {
        return buttonCuatro;
    }

    public void setButtonCuatro(JButton buttonCuatro) {
        this.buttonCuatro = buttonCuatro;
    }

    public JButton getButtonCinco() {
        return buttonCinco;
    }

    public void setButtonCinco(JButton buttonCinco) {
        this.buttonCinco = buttonCinco;
    }

    public JButton getButtonSeis() {
        return buttonSeis;
    }

    public void setButtonSeis(JButton buttonSeis) {
        this.buttonSeis = buttonSeis;
    }

    public JButton getButtonSiete() {
        return buttonSiete;
    }

    public void setButtonSiete(JButton buttonSiete) {
        this.buttonSiete = buttonSiete;
    }

    public JButton getButtonOcho() {
        return buttonOcho;
    }

    public void setButtonOcho(JButton buttonOcho) {
        this.buttonOcho = buttonOcho;
    }
}
