package modele;

public class CarreJoueur extends Element {
    private Positions p;

    public Positions getP() {
        return p;
    }

    public void setP(Positions p) {
        this.p = p;
    }

    public CarreJoueur(Positions p) {
        this.p=p;
    }
}
