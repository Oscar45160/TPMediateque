public abstract class Document {
    private static int compteurId = 0;
    private int id;
    private String titre;

    public Document(String titre) {
        this.id = ++compteurId;
        this.titre = titre;
    }

    public abstract int getNombreJoursEmprunt();

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Titre: " + titre;
    }
}

