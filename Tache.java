
// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
import java.util.Date;

public class Tache {

    private int identifiant;
    private static int dernierId = 1;
    private String titre;
    private String etat;
    private Date dateCreation;

    Date dateCreationTache = new Date();

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
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        if (this.etat.equals("EN_COURS") || this.etat.equals("PREVU") || this.etat.equals("TERMINE")) {
            this.etat = etat;
        } else {
            this.etat = "";
        }
    }

    // getter et setter de l'attribut dateCreation
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Tache(String titre) {
        this.identifiant = dernierId;
        this.dernierId++;
        this.titre = titre;
        this.etat = "PREVU";
        this.dateCreation = dateCreationTache;

    }

    public Tache(String titre, String etat) {
        this.identifiant = dernierId;
        this.dernierId++;
        this.titre = titre;
        this.etat = etat;
        this.dateCreation = dateCreationTache;

    }

    public Tache(String titre, String etat, Date dateCreation) {
        this.identifiant = dernierId;
        this.dernierId++;
        this.titre = titre;
        this.etat = etat;
        this.dateCreation = dateCreationTache;

    }

    public String toString() {
        return "Identifiant: " + identifiant + ", titre : " + titre + ", etat : " + etat
                + ", date de création : " + dateCreation;
    }

    // public static void main(String[] args) {
    // Date aujourdhui = new Date();

    // DateFormat fullDateFormat = DateFormat.getDateTimeInstance(
    // DateFormat.MEDIUM,
    // DateFormat.MEDIUM);
    // System.out.println(fullDateFormat.format(aujourdhui));
    // SimpleDateFormat formater = null;

    // Date aujourdhui = new Date();

    // formater = new SimpleDateFormat("dd-MM-yy");
    // System.out.println(formater.format(aujourdhui));

    // System.out.println(aujourdhui);

    // }

}