//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création de la médiathèque
        Mediatheque mediatheque = new Mediatheque();

        // Création et ajout de documents
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        CDAudio cd1 = new CDAudio("Kind of Blue", "Miles Davis", "Miles Davis");
        mediatheque.addDocument(livre1);
        mediatheque.addDocument(cd1);

        // Création et ajout d'adhérents
        Adherent adherent1 = new Adherent(1, "Jean", "Dupont", "jean.dupont@example.com");
        Adherent adherent2 = new Adherent(2, "Marie", "Curie", "marie.curie@example.com");
        mediatheque.addAdherent(adherent1);
        mediatheque.addAdherent(adherent2);

        // Simuler des emprunts
        System.out.println("Tentative d'emprunt 1 (devrait réussir) : " +
                mediatheque.emprunterDocument(adherent1, livre1));
        System.out.println("Tentative d'emprunt 2 (devrait échouer, document déjà emprunté) : " +
                mediatheque.emprunterDocument(adherent2, livre1));

        // Afficher tous les documents empruntés par un adhérent
        System.out.println("Documents empruntés par Jean Dupont :");
        mediatheque.afficherDocumentsEmpruntes(adherent1);

        // Gérer et afficher les retards (supposons qu'il y a des retards)
        System.out.println("Documents en retard :");
        mediatheque.afficherRetards();

        // Gérer le retour d'un document
        System.out.println("Retour d'un document : " + mediatheque.retournerDocument(livre1));        }
}
