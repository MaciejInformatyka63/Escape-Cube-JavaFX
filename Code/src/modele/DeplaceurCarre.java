package modele;

public class DeplaceurCarre extends Deplaceur{



    public void deplacer(Element cj,char d,int v, Collisionneur c) {
        Positions posFinales = c.Collision(cj, d);
        ;
        switch (d) {
            case 'h':
                while (cj.getP().getPosy1() > posFinales.getPosy1()) {
                    cj.setP(new Positions(cj.getP().getPosx1(), cj.getP().getPosx2(), cj.getP().getPosy1() - v, cj.getP().getPosy2() - v));
                }
                cj.setP(posFinales);
                break;

            case 'b':
                while (cj.getP().getPosy1() < posFinales.getPosy1()) {
                    cj.setP(new Positions(cj.getP().getPosx1(), cj.getP().getPosx2(), cj.getP().getPosy1() + v, cj.getP().getPosy2() + v));
                }
                cj.setP(posFinales);
                break;

            case 'g':
                while (cj.getP().getPosx1() > posFinales.getPosx1()) {
                    cj.setP(new Positions(cj.getP().getPosx1() - v, cj.getP().getPosx2() - v, cj.getP().getPosy1(), cj.getP().getPosy2()));
                }
                cj.setP(posFinales);
                break;

            case 'd':
                while (cj.getP().getPosx1() < posFinales.getPosx1()) {
                    cj.setP(new Positions(cj.getP().getPosx1() + v, cj.getP().getPosx2() + v, cj.getP().getPosy1(), cj.getP().getPosy2()));
                }
                cj.setP(posFinales);
                break;
        }
    }
}
