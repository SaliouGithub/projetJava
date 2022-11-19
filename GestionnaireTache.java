public class GestionnaireTache {

    private Tache[] taches;
    private int nombreTache;

    public GestionnaireTache(int nombreMax) {
        this.taches = new Tache[nombreMax];
        this.nombreTache = 0;
    }

    public boolean ajouter(Tache tache) {
        if (this.nombreTache == this.taches.length) {
            return false;
        } else {
            this.taches[nombreTache] = tache;
            this.nombreTache++;
            return true;
        }
    }

    public boolean modifier(Tache tache) {

        int i = 0;
        boolean bool = false;

        do {
            if (this.taches[i].getIdentifiant() == tache.getIdentifiant()) {
                this.taches[i].setTitre(tache.getTitre());
                this.taches[i].setEtat(tache.getEtat());
                this.taches[i].setDateCreation(tache.getDateCreation());
                bool = true;
            }
            i++;
        } while (bool = false && i < this.nombreTache);

        return bool;
    }

    // public boolean supprimer(int id) {

    // boolean bool = false;
    // int i = 0;

    // do {
    // if (this.taches[i].getIdentifiant() == id) {
    // bool = true;
    // for (int j = i; j < (this.nombreTache - 1); j++) {
    // this.taches[j] = this.taches[j + 1];
    // }
    // // this.taches[this.nombreTache] = null;
    // this.taches[this.nombreTache] = null;
    // this.nombreTache--;
    // }
    // i++;
    // } while (bool = false && i < this.nombreTache);

    // return bool;
    // }

    public boolean supprimer(int id) {

        for (int i = 0; i < this.taches.length; i++) {
            if (this.taches[i].getIdentifiant() == id) {
                this.taches[i] = null;
                return true;
            }
        }
        return false;
    }

    // public boolean supprimer(int id) {
    // boolean verif = false;
    // for (int i = 0; i < this.taches.length; i++) {
    // if (id == taches[i].getIdentifiant()) {

    // taches[i] = null;

    // verif = true;
    // }
    // }
    // if (verif) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    public Tache[] lister() {
        return taches;
    }

    public Tache[] lister(String etat) {
        Tache[] listeTaches = new Tache[this.nombreTache];
        int j = 0;
        for (int i = 0; i < taches.length; i++) {
            if (taches[i].getEtat().equals(etat)) {
                listeTaches[j] = taches[i];
                j++;
            }
        }
        return listeTaches;
    }

    public int getNombreTache() {
        return 0;
    }

    public void setNombreTache(int nbreTache) {
    }

    public void setTaches(Tache[] taches) {
        this.taches = taches;
    }

    public Tache[] getTaches() {
        return taches;
    }

}
