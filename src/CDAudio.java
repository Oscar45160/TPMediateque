public class CDAudio extends Document{
    private String interprete;
    private String compositeur;

    public CDAudio(String titre, String interprete, String compositeur) {
        super(titre);
        this.interprete = interprete;
        this.compositeur = compositeur;
    }

    public String getCompositeur() {
        return compositeur;
    }

    @Override
    public int getNombreJoursEmprunt() {
        return 15;
    }
    @Override
    public String toString() {
        return super.toString() + ", Interprète: " + interprete + ", Compositeur: " + compositeur;
    }
}
