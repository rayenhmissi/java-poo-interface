public class Villa extends ProprietePrive {
    private boolean avecPiscine;
    public Villa(int id, Personne responsable, String adresse, double surface, int nbPiece, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPiece);
        this.avecPiscine = avecPiscine;
    }
    public boolean isAvecPiscine() {
        return avecPiscine;
    }
    public String toString() {
        return "Villa [id=" + id + ", avecPiscine=" + avecPiscine + ", NbPiece=" + NbPiece + ", responsable="
                + responsable + ", adresse=" + adresse + ", surface=" + surface + "]";
    }
    public double calculer_impot(){
       if (avecPiscine ==true){
        return super.calculer_impot()+200;
       }
       else{
        return super.calculer_impot();
       }
    }
}
