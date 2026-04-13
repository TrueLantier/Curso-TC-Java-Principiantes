package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelButton extends JPanel {
    private JButton buttonUno, buttonDos, buttonTres, buttonCuatro, buttonCinco, buttonSeis, buttonSiete,
    buttonOcho;
    private JButton[] buttons;
    private Timer timer = new Timer(1000, e -> moverResaltado());
    public ImageIcon iconImage;
    private final Border bordeResaltado = BorderFactory.createLineBorder(Color.RED, 4);
    private final Border bordeSeleccionado = BorderFactory.createLineBorder(Color.GREEN, 4);
    private Border bordeGeneral;
    private int indiceActual = 4;
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
        setLayout(new MigLayout("fillx, insets 0, gap 40 10 10 10"));

        iconImage = ponerFoto(rutaFotos[0], 40);
        buttonUno = new JButton(iconImage);
        buttonUno.setActionCommand("Dream");
        hacerBotón(buttonUno, principal);

        bordeGeneral = buttonUno.getBorder();

        iconImage = ponerFoto(rutaFotos[1], 40);
        buttonDos = new JButton(iconImage);
        buttonDos.setActionCommand("Spell");
        hacerBotón(buttonDos, principal);

        iconImage = ponerFoto(rutaFotos[2], 40);
        buttonTres = new JButton(iconImage);
        buttonTres.setActionCommand("Nephis");
        hacerBotón(buttonTres, principal);

        iconImage = ponerFoto(rutaFotos[3], 40);
        buttonCuatro = new JButton(iconImage);
        buttonCuatro.setActionCommand("Creature");
        hacerBotón(buttonCuatro, principal);

        iconImage = ponerFoto(rutaFotos[4], 40);
        buttonCinco = new JButton(iconImage);
        buttonCinco.setActionCommand("Luffy");
        hacerBotón(buttonCinco, principal);
        hacerBotón(buttonUno, principal);

        iconImage = ponerFoto(rutaFotos[5], 40);
        buttonSeis = new JButton(iconImage);
        buttonSeis.setActionCommand("Mugiwara");
        hacerBotón(buttonSeis, principal);

        iconImage = ponerFoto(rutaFotos[6], 40);
        buttonSiete = new JButton(iconImage);
        buttonSiete.setActionCommand("Sunny");
        hacerBotón(buttonSiete, principal);

        iconImage = ponerFoto(rutaFotos[7], 40);
        buttonOcho = new JButton(iconImage);
        buttonOcho.setActionCommand("Haki");
        hacerBotón(buttonOcho, principal);

        buttons = new  JButton[]{buttonUno, buttonDos, buttonTres, buttonCuatro, buttonCinco, buttonSeis,
        buttonSiete, buttonOcho};

        add(new JSeparator(), "growx, span, wrap");

        add(buttonCinco, "gapleft 70");
        add(buttonSeis);
        add(buttonSiete);
        add(buttonOcho, "wrap");

        //add(new JSeparator(), "growx, span, wrap");

        add(buttonUno, "gapleft 70");
        add(buttonDos);
        add(buttonTres);
        add(buttonCuatro, "wrap");

        add(new JSeparator(), "growx, span, wrap");

        generar();
    }

    private ImageIcon ponerFoto(String ruta, int tamaño) {
        ImageIcon icon = new ImageIcon(ruta);
        Image imagen = icon.getImage().getScaledInstance(tamaño, tamaño, Image.SCALE_SMOOTH);
        icon = new ImageIcon(imagen);
        return icon;
    }

    private void hacerBotón(JButton button, ActionListener pantalla) {
        button.setBackground(Color.BLACK);
        button.addActionListener(pantalla);
    }

    public void generar() {
        if (timer.isRunning()) {
            timer.stop();
        }

        buttons[indiceActual].setBorder(bordeResaltado);

        timer = new Timer(1000, e -> moverResaltado());
        timer.start();

        for (int i = 0; i < buttons.length; i++) {
            final int idx = i;
            buttons[i].addActionListener(e -> seleccionarBoton(idx));
        }
    }

    private void moverResaltado() {
        buttons[indiceActual].setBorder(bordeGeneral);
        indiceActual = (indiceActual + 1) % buttons.length;
        buttons[indiceActual].setBorder(bordeResaltado);
    }

    private void seleccionarBoton(int index) {
        if (timer.isRunning()) {
            timer.stop();
        }

        for (JButton button: buttons) {
            button.setBorder(bordeGeneral);
        }

        buttons[index].setBorder(bordeSeleccionado);
        indiceActual = index;
    }

    private void seleccionarBotonActual() {
        if (timer.isRunning()) {
            seleccionarBoton(indiceActual);
        }
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
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
