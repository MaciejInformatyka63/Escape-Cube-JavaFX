package modele.métier;

public abstract class Element {

    private Positions p;

    public Element(Positions p) {
        setP(p);
    }

    public Positions getP() {
        return p;
    }

    public void setP(Positions val) {
        p=val;
    }

}
