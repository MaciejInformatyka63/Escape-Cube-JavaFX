package modele.gestion;

import modele.chronos.ChronoRefresh;
import modele.metier.Element;
import modele.metier.Positions;

import java.util.List;

public abstract class Deplaceur {
    public List<Collisionneur> LesCollisionneurs;

    public Element getE() {
        return e;
    }

    private ChronoRefresh chronoR;

    public ChronoRefresh getChronoR() {
        return chronoR;
    }

    public void setChronoR(ChronoRefresh chronoR) {
        this.chronoR = chronoR;
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

    protected Element e;
    protected char d;
    protected int v;
    protected Positions posFinales;


    public abstract boolean deplacer();
}
