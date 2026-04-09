package PruebaCapas.desafíonavideño.logic;

import PruebaCapas.desafíonavideño.gui.UIDesafíoNavideño;

import javax.swing.*;

public class AdivinanzasLógica {
    private final String[] ONEPIECE = {"Luffy", "Mugiwara", "Sunny", "Haki"};
    private final String[] SHADOWSLAVE = {"Dream", "Spell", "Nephis", "Creature"};
    private String objeto, tema, sopaActual;

    public boolean pulsarBotónÍcono(String nombreBotón) {
        for (String palabra: ONEPIECE) {
            if (palabra.equals(nombreBotón)) {
                tema = "One Piece";
                objeto = nombreBotón;
                sopaActual = SOPAOPUNO;
                return true;
            }
        }
        for (String palabra: SHADOWSLAVE) {
            if (palabra.equals(nombreBotón)) {
                tema = "Shadow Slave";
                objeto = nombreBotón;
                sopaActual = SOPASSUNO;
                return true;
            }
        }
        return false;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String[] getSHADOWSLAVE() {
        return SHADOWSLAVE;
    }

    public String[] getONEPIECE() {
        return ONEPIECE;
    }

    public String getSopa() {
        return SOPA;
    }

    public String getSopaOPUno() {
        return SOPAOPUNO;
    }

    public String getSopaSSUno() {
        return SOPASSUNO;
    }

    public String getSopaActual() {
        return sopaActual;
    }

    public void setSopaActual(String sopaActual) {
        this.sopaActual = sopaActual;
    }

    private final String SOPASSUNO =
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

    private final String SOPAOPUNO =
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

    private final String SOPA = "PQRTABCDEFGHJKLSOVXZ\n" +
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
}
