public class Film extends Document{
    private String realisateur;
    private int annee;

    public Film(String titre, String realisateur, int annee) {
        super(titre);
        this.realisateur = realisateur;
        this.annee = annee;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public int getNombreJoursEmprunt() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Réalisateur: " + realisateur + ", Année: " + annee;
    }
}
