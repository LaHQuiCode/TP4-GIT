/**
 * Fonctionnalités :
 * Affichage des notes d'un étudiant.
 * Calcul et affichage de la moyenne des notes.
 * Gestion des cas où les notes sont nulles ou vides.
 */
public class GestionnaireNotes {

    /**
     * Affiche les notes et la moyenne d'un étudiant.
     * Vérifie si le tableau des notes est vide ou null avant de procéder.
     *
     * @param nomEtudiant 
     * @param notes   
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Vérification des notes nulles ou vides
        if (notes == null || notes.length == 0) {
            System.out.println("Aucune note n'est disponible pour " + nomEtudiant + ".");
            return;
        }

        // Affichage des notes
        afficherNotes(nomEtudiant, notes);

        // Calcul et affichage de la moyenne
        double moyenne = calculerMoyenne(notes);
        System.out.printf("La moyenne de %s : %.2f%n", nomEtudiant, moyenne);
    }

    /**
     * Affiche les notes d'un étudiant.
     *
     * @param nomEtudiant 
     * @param notes  
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + " :");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes d'un étudiant.
     *
     * @param notes 
     * @return 
     */
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}
