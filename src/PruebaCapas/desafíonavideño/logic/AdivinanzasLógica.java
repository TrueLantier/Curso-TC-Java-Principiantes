package PruebaCapas.desafíonavideño.logic;

import PruebaCapas.desafíonavideño.gui.UIDesafíoNavideño;

import javax.swing.*;

public class AdivinanzasLógica {
    public String sopaSSUno =
            "DREAMBFGJKVWXYZSCQTO\n" +
                    "BVWXYZKJGFNQTOBPRKNV\n" +
                    "SPELLBVWXYZEQTOEEFEG\n" +
                    "BVWXYZKJGFDQPTOLABPV\n" +
                    "BVWXYLLEPSRQKHGLTFHB\n" +
                    "BVWXYZKJGFEQTOIBUVIK\n" +
                    "NEPHISBVWXAYZKJSRGSF\n" +
                    "BVWXYDZKJGMFQTOBEVWX\n" +
                    "BVWXYZRKJGFQTOBVWXYZ\n" +
                    "SBVWXYZEKNEPHISBVWXY\n" +
                    "BPVWXYZKAJGFQTOBVWXY\n" +
                    "CREATUREBMVWXYZKJGFQ\n" +
                    "BVWLXYZKJGFQTOBVWXYZ\n" +
                    "BVWXLYZKJGFQTOBVWXYZ";

    public String sopaOPUno =
            "SUNNYBCDEFGHJKSLMPQR\n" +
                    "HAKIVWXZTOPQRUBUCDEF\n" +
                    "GBCDELUFFYPQNMOFRSTV\n" +
                    "WXZSABCDEGHNJKLFMOPQ\n" +
                    "RTVUWXZABCYDEFGYHIJK\n" +
                    "HBCNDEFGJKLPARAWIGUM\n" +
                    "BACNDEFGAHYNNUSPQRTV\n" +
                    "BCKYDEFGRHJLMNOPQSTV\n" +
                    "LBCIDEFGAHJKMNOPQRST\n" +
                    "BUCDEFGJWKSLMNOPQHRT\n" +
                    "BCFDIKAHIEGUJLMNOAPQ\n" +
                    "BCDFEHJLGMOPNQRSTKWV\n" +
                    "BCDEYFGHUJKLMNOPQIRS\n" +
                    "BCDEFGHJMKLNOPYQRSTV";

    public String sopa = "PQRTABCDEFGHJKLSOVXZ\n" +
            "BVNMKLOPQRTWXZUCDYAE\n" +
            "CDFUGHILUFFYJNOPQRST\n" +
            "AEKGLMNOPQRSNTUVWXYZ\n" +
            "BFJIOPQRSTUYVWXACDEG\n" +
            "HIKWLMNOPQRSTUVWXYZA\n" +
            "BCDAEFGHJKLMNOPQRIST\n" +
            "UVWRXYZABCDEFGHJLKMN\n" +
            "OPQARSTUVWXYZABCDAEF\n" +
            "GHIJKLMNOPQRSTUVWHXY\n" +
            "ZABCDEFGHIJKLMNOPQRS\n" +
            "TUVWXYZABCDEFGHIJKLM\n" +
            "NOPQRSTUVWXYZABCDEFG\n" +
            "HIJKLMNOPQRSTUVWXYZA";

    private final String[] ONEPIECE = {"Luffy", "Mugiwara", "Sunny", "Haki"};
    private final String[] SHADOWSLAVE = {"Dream Realm", "Nightmare Spell", "Nephis", "Nightmare Creature"};
    private String objeto;

    public void setLabel(JLabel label) {
        for (String palabra: ONEPIECE) {
            if (palabra.equals(objeto)) {
                label.setText("One Piece: " + objeto);
                return;
            }
        }
        for (String palabra: SHADOWSLAVE) {
            if (palabra.equals(objeto)) {
                label.setText("Shadow Slave: " + objeto);
                return;
            }
        }
    }

    public boolean pulsarBotónÍcono(String botón) {
        for (String palabra: ONEPIECE) {
            if (palabra.equals(botón)) {
                objeto = botón;
                //setLabel(ui.getLabelElegir());
                return true;
            }
        }
        for (String palabra: SHADOWSLAVE) {
            if (palabra.equals(botón)) {
                objeto = botón;
                return true;
            }
        }
        return false;
    }
}
