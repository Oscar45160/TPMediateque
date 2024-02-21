import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Mediatheque {
    private List<Document> documents = new ArrayList<>();
    private List<Adherent> adherents = new ArrayList<>();
    private List<Emprunt> empruntsActifs = new ArrayList<>();
    public void addDocument(Document document) {
        documents.add(document);
    }

    public void addAdherent(Adherent adherent) {
        adherents.add(adherent);
    }

    public Document rechercheDocument(String titre) {
        for (Document document : documents) {
            if (document.getTitre().equals(titre)) {
                return document;
            }
        }
        return null;
    }

    public boolean emprunterDocument(Adherent adherent, Document document) {
        // Vérifier si le document est déjà emprunté
        for (Emprunt emprunt : empruntsActifs) {
            if (emprunt.getDocument().equals(document)) {
                return false;
            }
        }

        // Vérifier si l'adhérent a déjà emprunté 3 documents
        long count = empruntsActifs.stream().filter(emprunt -> emprunt.getAdherent().equals(adherent)).count();
        if (count >= 3) {
            return false; // Limite d'emprunts atteinte
        }

        // Emprunter le document
        empruntsActifs.add(new Emprunt(new Date(), adherent, document));
        return true;
    }

    public boolean retournerDocument(Document document) {
        for (Emprunt emprunt : empruntsActifs) {
            if (emprunt.getDocument().equals(document)) {
                empruntsActifs.remove(emprunt);
                return true;
            }
        }
        return false;
    }

    public void afficherDocumentsEmpruntes(Adherent adherent) {
        for (Emprunt emprunt : empruntsActifs) {
            if (emprunt.getAdherent().equals(adherent)) {
                System.out.println(emprunt.getDocument().getTitre());
            }
        }
    }

    public void afficherRetards() {
        Date aujourdHui = new Date();
        for (Emprunt emprunt : empruntsActifs) {
            long duree = aujourdHui.getTime() - emprunt.getDateEmprunt().getTime();
            long jours = TimeUnit.MILLISECONDS.toDays(duree);

            if (jours > emprunt.getDocument().getNombreJoursEmprunt()) {
                System.out.println("Document en retard: " + emprunt.getDocument().getTitre() +
                        ", Emprunté par: " + emprunt.getAdherent().getPrenom() + " " + emprunt.getAdherent().getNom() +
                        ", Email: " + emprunt.getAdherent().getEmail());
            }
        }
    }
}
