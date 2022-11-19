import java.util.Date;
import java.util.Scanner;

public class GestionTache {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Tache tache;

        // System.out.println("Veuillez renseigner le nombre de tache que le
        // gestionnaire de tache peut contenir");
        // int gestionNombreTache = in.nextInt();
        // GestionnaireTache gestionnaireTache = new
        // GestionnaireTache(gestionNombreTache);

        // Tache tache2 = new Tache(null);
        // Tache tache1 = new Tache(null);
        GestionnaireTache gestionnaireTache = new GestionnaireTache(20);

        int menuChoix = -1;
        while (menuChoix != 0) {
            menuChoix = menu();

            switch (menuChoix) {
                case 1:

                    // System.out.println("Ajout tache");
                    // creerTache();
                    if (gestionnaireTache.ajouter(creerTache())) {
                        System.out.println("Tache ajoutée avec succès");
                    } else {
                        System.out.println("Erreur d'ajout");
                    }

                    break;

                case 2:

                    System.out.println("Modifier tache");
                    System.out.println("Entrez l'identifiant de la tache à modifier: ");
                    int id = in.nextInt();
                    int choix1;
                    String etat = "PREVU";
                    // if(gestionnaireTache.modifier(getIdentifiant) == id)
                    // gestionnaireTache.modifier(null)
                    Tache tache = rechercheTache(id, gestionnaireTache.lister());
                    if (tache != null) {
                        in.nextLine();
                        System.out.println("Voici la tache sélectionnée: ");
                        System.out.println(tache.toString());
                        System.out.print("Entrez le nouveau titre: ");
                        String titre = in.nextLine();
                        tache.setTitre(titre);
                        do {
                            System.out.println("Choisir le nouveau etat de la tache");
                            System.out.println("1. EN_COURS");
                            System.out.println("2. PREVU");
                            System.out.println("3. TERMINE");
                            choix1 = in.nextInt();
                            if (choix1 != 1 && choix1 != 2 && choix1 != 3) {
                                System.out.println("Veuillez faire un choix valide !!");
                            }
                        } while (choix1 != 1 && choix1 != 2 && choix1 != 3);
                        switch (choix1) {
                            case 1:
                                etat = "EN_COURS";
                                break;

                            case 2:
                                etat = "PREVU";
                                break;

                            case 3:
                                etat = "TERMINE";
                                break;

                        }
                        // = in.nextLine();
                        tache.setEtat(etat);
                        // System.out.print("Entrez la nouvelle date: ");
                        Date date = new Date();
                        tache.setDateCreation(date);
                        if (gestionnaireTache.modifier(tache))
                            System.out.println("Tache Modifiiée avec succès");
                        else
                            System.out.println("Erreur modification");

                        // System.out.print("Tapez 1 pour retourner sur la premiere page: ");
                        // retour = in.nextInt();
                    }
                    break;

                case 3:
                    System.out.println("Suppression");
                    // System.out.println("Voici la liste des tâches: ");
                    // affichageListeTache(gestionnaireTache.lister());
                    System.out.print("Donner l'identifiant de la tache à supprimer: ");
                    id = in.nextInt();

                    if (gestionnaireTache.supprimer(id))
                        System.out.println("Tache supprimée avec succès");
                    else
                        System.out.println("Error saisi");
                    break;

                case 4:
                    System.out.println("Afficher liste");
                    // for (Tache tache : gestionnaireTache.lister())
                    // System.out.println(tache.toString());
                    affichageListeTache(gestionnaireTache.lister());
                    break;

                case 5:
                    // System.out.println("Afficher liste des tâches par etat");
                    // // String etat = "PREVU";
                    // do {
                    // System.out.println("Choisir l'etat dont vous vooulez afficher les taches");
                    // System.out.println("1. EN_COURS");
                    // System.out.println("2. PREVU");
                    // System.out.println("3. TERMINE");
                    // choix1 = in.nextInt();
                    // if (choix1 != 1 && choix1 != 2 && choix1 != 3) {
                    // System.out.println("Veuillez faire un choix valide !!");
                    // }
                    // } while (choix1 != 1 && choix1 != 2 && choix1 != 3);
                    // switch (choix1) {

                    // case 1:
                    // etat = "EN_COURS";
                    // // System.out.println("Affichage tache " + etat);
                    // // gestionnaireTache.lister(etat);

                    // break;

                    // case 2:
                    // etat = "PREVU";
                    // // System.out.println("Affichage tache " + etat);
                    // // gestionnaireTache.lister(etat);

                    // break;

                    // case 3:
                    // etat = "TERMINE";
                    // // System.out.println("Affichage tache " + etat);
                    // // gestionnaireTache.lister(etat);

                    // break;

                    // }
                    // String eta;
                    // for (int i = 0; i < gestionnaireTache.lister(etat).length; i++) {

                    // System.out.println(gestionnaireTache.lister()[i].toString());
                    // }
                    // System.out.println("Donnez l'etat des taches que vous voulez lister");
                    // Scanner e = new Scanner(System.in);
                    // String eta = e.next();
                    // System.out.println("Liste des taches par etat");
                    // for (int i = 0; i < gestionnaireTache.lister(eta).length; i++) {

                    // System.out.println(gestionnaireTache.lister(eta)[i].toString());
                    // }
                    String etat2 = "PREVU";
                    etat = etat2;
                    affichageListeTache(gestionnaireTache.lister(etat));

                    break;

                case 0:
                    break;
                default:
                    System.out.println("Entrer une option valide");
            }
        }
    }

    public static int menu() {
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Gestion tâche");
        System.out.println("----------------------");
        System.out.println("0. Quitter le programme");
        System.out.println("1. Ajouter une tâche ");
        System.out.println("2. Modifier une tâche");
        System.out.println("3. Supprimer une tâche");
        System.out.println("4. Afficher la liste des tâches");
        System.out.println("5. Afficher la liste des tâches par etat");
        System.out.println();
        System.out.print("Entrer un choix: ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        return choix;
    }

    public static Tache creerTache() {
        Tache tache;
        int choix, choix1, choix2;
        int nombreArgument = 1;
        String etat = "PREVU";
        Date dateCreationTache = new Date();
        Date dateCreation = dateCreationTache;
        Scanner in = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Menu ajouter tâche");
        System.out.println("----------------------");
        System.out.println("Donner le titre de la tache");
        String titre = in.nextLine();
        do {
            System.out.println("Voulez-vous renseigner l'etat de la tache ?");
            System.out.println("1. OUI");
            System.out.println("2. NON");
            choix = in.nextInt();
            if (choix != 1 && choix != 2) {
                System.out.println("Veuillez faire un choix valide !!");
            }
        } while (choix != 1 && choix != 2);
        if (choix == 2) {
            tache = new Tache(titre);
            return tache;
        } else {
            nombreArgument++;
            do {
                System.out.println("Choisir etat de la tache");
                System.out.println("1. EN_COURS");
                System.out.println("2. PREVU");
                System.out.println("3. TERMINE");
                choix1 = in.nextInt();
                if (choix1 != 1 && choix1 != 2 && choix1 != 3) {
                    System.out.println("Veuillez faire un choix valide !!");
                }
            } while (choix1 != 1 && choix1 != 2 && choix1 != 3);
            // String titre = in.nextLine();
            switch (choix1) {
                case 1:
                    etat = "EN_COURS";
                    break;

                case 2:
                    etat = "PREVU";
                    break;

                case 3:
                    etat = "TERMINE";
                    break;

            }
            do {
                System.out.println("Voulez-vous renseigner la date de création?");
                System.out.println("1. OUI");
                System.out.println("2. NON");
                choix2 = in.nextInt();
                if (choix2 != 1 && choix2 != 2) {
                    System.out.println("Veuillez faire un choix valide !!");
                }
            } while (choix2 != 1 && choix2 != 2);
            if (choix2 == 2) {
                tache = new Tache(titre, etat);
                return tache;
            } else {
                System.out.println("Donner la date sous format DD/MM/YY");
                tache = new Tache(titre, etat, dateCreation);
                return tache;
            }
        }

    }

    public static void affichageListeTache(Tache[] taches) {
        for (Tache tache : taches)
            System.out.println(tache.toString());
    }

    public static Tache rechercheTache(int id, Tache[] taches) {
        for (Tache tache : taches) {
            if (tache.getIdentifiant() == id)
                return tache;
        }
        return null;
    }
    /*
     * switch (nombreArgument) {
     * case 1:
     * tache = new Tache(titre);
     * return tache;
     * 
     * case 2:
     * tache = new Tache(titre, etat);
     * return tache;
     * 
     * case 3:
     * tache = new Tache(titre, etat, dateCreation);
     * return tache;
     * }
     * 
     * return tache;
     */
}