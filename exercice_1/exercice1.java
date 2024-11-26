public class FactureManager {

    /**
     * Calcule le total d'une facture après application des réductions.
     *
     * @param typeProduit  le type de produit (Alimentaire, Electronique, Luxe, etc.)
     * @param quantite     la quantité de produits
     * @param prixUnitaire le prix unitaire du produit
     * @return le total de la facture après réductions
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // Appliquer la réduction en fonction du type de produit
        total -= total * getReductionParType(typeProduit);

        // Appliquer une réduction supplémentaire si le total dépasse 1000
        if (total > 1000) {
            total *= 0.95; // Réduction de 5%
        }

        return total;
    }

    /**
     * Retourne le pourcentage de réduction en fonction du type de produit.
     *
     * @param typeProduit le type de produit
     * @return le pourcentage de réduction (sous forme décimale)
     */
    private double getReductionParType(String typeProduit) {
        switch (typeProduit) {
            case "Alimentaire":
                return 0.05; // Réduction de 5%
            case "Electronique":
                return 0.1; // Réduction de 10%
            case "Luxe":
                return 0.15; // Réduction de 15%
            default:
                return 0.0; // Pas de réduction pour les autres types
        }
    }
}
