public class Lotisisement implements GestionPropriete {
    protected int nombre=0;
    protected int cap;
    protected  Propriete[] tabprop;
    public Lotisisement(Propriete[] tabprop, int cap) {
        this.tabprop= tabprop;
        this.cap=cap;
    }
    public void afficher_propriete(Propriete p){
        System.out.println(p.toString());
    }
    public boolean ajouter_propriete(Propriete p) {
        if (this.nombre <= this.cap){
            tabprop[nombre]=p;
            nombre++;
            return true;
        }
        else{
            System.out.println("tableau est rempli");
            return true;
        }
    }
    public boolean supprimer_propriete(Propriete p) {
        return true;
    }
    public int getProprieteByIndex(int i,Propriete p){
        while (i < nombre || tabprop[i].equals(p)==false){
            i++;
        }
        return i;
    }
    public int getNbPiece(Propriete p){
        if (p instanceof ProprietePrive){
            ProprietePrive ppr=(ProprietePrive)p;
            return ppr.getNbPiece();
        }
        else{
            return 0;
        }
    }
}
