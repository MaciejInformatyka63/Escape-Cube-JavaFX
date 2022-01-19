package modele.metier;

public abstract class Element {

    private Positions p;

    public Element(Positions p) {
        this.p=p;
    }

    public Positions getP() {
        return p;
    }

    public void setP(Positions val) {
        p.setPosx1(val.getPosx1());
        p.setPosx2(val.getPosx2());
        p.setPosy1(val.getPosy1());
        p.setPosy2(val.getPosy2());
    }

}
