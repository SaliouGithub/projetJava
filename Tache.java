import java.util.Date;

public class Tache {

    private int identifiant;
    private int dernierId;
    private String titre;
    private Etat etat;
    private Date dateCreation;

    // getteur et setteur de l'attribut identifiant
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    // getter et setter de l'attribut dernierId
    public int getDernierId() {
        return dernierId;
    }

    public void setDernierId(int dernierId) {
        this.dernierId = dernierId;
    }

    // getter et setter de l'identifiant titre
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    // getter et setter de l'attribut etat
    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    // getter et setter de l'attribut dateCreation
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Tache(String titre) {

    }

    public Tache(String titre, String etat) {

    }

    public Tache(String titre, String etat, Date dateCreation) {

    }

    public String toString() {
        return "";
    }

}