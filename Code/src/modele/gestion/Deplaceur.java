package modele.gestion;

import modele.chronos.Chrono;
import modele.chronos.ChronoRefresh;
import modele.metier.Element;
import modele.metier.Positions;

import java.util.ArrayList;
import java.util.List;

public abstract class Deplaceur {

    private Element e;
    private char d;
    private int v;
    private Positions posFinales;


    public Element getE() {
        return e;
    }

    public void setE(Element e) {
        this.e = e;
    }

    public char getD() {
        return d;
    }

    public void setD(char d) {
        this.d = d;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public Positions getPosFinales() {
        return posFinales;
    }

    public void setPosFinales(Positions posFinales) {
        this.posFinales = posFinales;
    }

    public void detacherChrono(ChronoRefresh chrono) {
        chrono.delDeplaceur(this);
    }

    public void attacherChrono(ChronoRefresh chrono) {
        chrono.addDeplaceur(this);
    }

    public abstract boolean deplacer();
}
