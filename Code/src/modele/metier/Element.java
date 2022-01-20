package modele.metier;

public abstract class Element {

    private Positions p;

    /**
     * Constructeur de la classe Element
     * @param p Positions de l'élément
     */
    public Element(Positions p) {
        this.p=p;
    }

    /**
     * getter de l'attribut p
     * @return attribut p
     */
    public Positions getP() {
        return p;
    }

    /**
     * Setter de l'attribut p
     * @param val nouvelle valeur de l'attribut p
     */
    public void setP(Positions val) {
        p.setPosx1(val.getPosx1());
        p.setPosx2(val.getPosx2());
        p.setPosy1(val.getPosy1());
        p.setPosy2(val.getPosy2());
    }

}
