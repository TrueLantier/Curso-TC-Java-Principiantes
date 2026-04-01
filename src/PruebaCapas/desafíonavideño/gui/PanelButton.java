package PruebaCapas.desafíonavideño.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelButton extends JPanel implements ActionListener {
    private JButton buttonUno, buttonDos, buttonTres, buttonCuatro;
    private ImageIcon iconImage;
    private String[] rutaFotos = {
            "src/PruebaCapas/resources/images/dream-realm.png",
            "src/PruebaCapas/resources/images/the-spell.png",
            "src/PruebaCapas/resources/images/nephis-saint.png",
            "src/PruebaCapas/resources/images/nightmare-creature.png",
            ""
    };


    public PanelButton() {
        setLayout(new MigLayout("insets 0, gap 40"));

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

        add(buttonUno, "gapleft 90");
        add(buttonDos);
        add(buttonTres);
        add(buttonCuatro);


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
