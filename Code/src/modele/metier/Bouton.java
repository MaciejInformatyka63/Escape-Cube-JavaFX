package modele.metier;

public abstract class Bouton {
    private boolean appuyé;

    public boolean isAppuyé() {
        return appuyé;
    }

    public void setAppuyé(boolean appuyé) {
        this.appuyé = appuyé;
    }

    public Bouton(boolean appuyé) {
        this.appuyé = appuyé;
    }
}
