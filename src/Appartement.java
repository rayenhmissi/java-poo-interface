public class Appartement extends ProprietePrive {
    private int numEtage;
    public Appartement(int id, Personne responsable, String adresse, double surface, int nbPiece, int numEtage) {
        super(id, responsable, adresse, surface, nbPiece);
        this.numEtage = numEtage;
    }
    public int getNumEtage() {
        return numEtage;
    }
    public String toString() {
        return "Appartement [id=" + id + ", numEtage=" + numEtage + ", NbPiece=" + NbPiece + ", responsable="
        + responsable + ", adresse=" + adresse + ", surface=" + surface + "]";
    }
}
