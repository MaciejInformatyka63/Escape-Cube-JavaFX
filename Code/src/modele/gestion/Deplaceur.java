package modele.gestion;

import modele.chronos.ChronoRefresh;
import modele.metier.Element;
import modele.metier.Positions;

/**
 * Classe permettant de déplacer un élément dans un Niveau
 */
public abstract class Deplaceur {

    protected Element e;
    protected char d;
    protected int v;
    protected Positions posFinales;

    protected ChronoRefresh cf;

    /**
     * Getter de l'attribut e
     * @return attribut e
     */
    public Element getE() {return e;}

    /**
     * Setter de l'attribut e
     * @param e nouvelle valeur de e
     */
    public void setE(Element e) {this.e = e;}

    /**
     * Getter de l'attribut d
     * @return attribut d
     */
    public char getD() {return d;}
    /**
     * Setter de l'attribut d
     * @param d nouvelle valeur de d
     */
    public void setD(char d) {this.d = d;}

    /**
     * Getter de l'attribut v
     * @return attribut v
     */
    public int getV() {return v;}
    /**
     * Setter de l'attribut v
     * @param v nouvelle valeur de v
     */
    public void setV(int v) {this.v = v;}


    /**
     * Getter de l'attribut posFinales
     * @return attribut posFinales
     */
    public Positions getPosFinales() {return posFinales;}
    /**
     * Setter de l'attribut posFinales
     * @param posFinales nouvelle valeur de posFinales
     */
    public void setPosFinales(Positions posFinales) {this.posFinales = posFinales;}

    /**
     * Permet de détacher un déplaceur d'un chrono
     * @param chrono chrono duquel il faut détacher le déplaceur
     */
    public void detacherChrono(ChronoRefresh chrono) {
        cf=null;
        chrono.delDeplaceur(this);
    }

    /**
     * Permet d'attacher un déplaceur à un chrono
     * @param chrono chrono auquel il faut attacher le déplaceur
     */
    public void attacherChrono(ChronoRefresh chrono) {
        cf=chrono;
        chrono.addDeplaceur(this);
    }

    /**
     * Méthode permettant de déplacer l'élément e
     */
    public abstract void deplacer();
}
