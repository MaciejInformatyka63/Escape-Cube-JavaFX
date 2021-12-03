package modele;

public class Positions {
    private int posx1;
    private int posx2;
    private int posy1;
    private int posy2;

    public void setPosx1(int posx1) {
        this.posx1 = posx1;
    }

    public void setPosx2(int posx2) {
        this.posx2 = posx2;
    }

    public void setPosy1(int posy1) {
        this.posy1 = posy1;
    }

    public void setPosy2(int posy2) {
        this.posy2 = posy2;
    }

    public int getPosx1() {
        return posx1;
    }

    public int getPosx2() {
        return posx2;
    }

    public int getPosy1() {
        return posy1;
    }

    public int getPosy2() {
        return posy2;
    }

    public Positions(int posx1, int posx2, int posy1, int posy2) {
        this.posx1 = posx1;
        this.posx2 = posx2;
        this.posy1 = posy1;
        this.posy2 = posy2;
    }
}
