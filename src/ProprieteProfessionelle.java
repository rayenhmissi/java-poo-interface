public abstract class ProprieteProfessionelle extends Propriete{
    private int NbEmployer;
    private boolean EstEtatique;
    public ProprieteProfessionelle(int id, Personne responsable, String adresse, double surface, int nbEmployer,
boolean estEtatique){
        super(id, responsable, adresse, surface);
        NbEmployer = nbEmployer;
        EstEtatique = estEtatique;
    }
    public int getNbEmployer() {
        return NbEmployer;
    }
    public boolean isEstEtatique() {
        return EstEtatique;
    }
    public double calculer_impot() {
        if (super.adresse!="Etat"){
            return (100*(surface/100))+(30*NbEmployer);
        }
        else{
            return 0;
        }
    }
}
