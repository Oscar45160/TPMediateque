import java.util.Date;

public class Emprunt {
    private Date dateEmprunt;
    private Adherent adherent;
    private Document document;


    public Emprunt(Date dateEmprunt, Adherent adherent, Document document) {
        this.dateEmprunt = dateEmprunt;
        this.adherent = adherent;
        this.document = document;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }



    @Override
    public String toString() {
        return "Date d'emprunt: " + dateEmprunt + ", Adhérent: " + adherent + ", Document: " + document;
    }
}