public class Livre extends Document {
    private String auteur;

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    @Override
    public int getNombreJoursEmprunt() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Auteur: " + auteur;
    }
}

