public class ProprietePrive extends Propriete{
    protected int NbPiece;
    public ProprietePrive(int id, Personne responsable, String adresse, double surface, int nbPiece) {
        super(id, responsable, adresse, surface);
        NbPiece = nbPiece;
    }
    public void setNbPiece(int nbPiece) {
        NbPiece = nbPiece;
    }
    public int getNbPiece() {
        return NbPiece;
    }
    public double calculer_impot(){
        return (50*(surface/100))+(10*NbPiece);
    }
}
