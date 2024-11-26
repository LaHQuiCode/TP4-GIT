/**
 * Fonctionnalités :
 * Ajout de produits au stock.
 * Retrait de produits du stock avec vérification de la quantité disponible.
 *  Gestion des cas où l'opération est inconnue.
 */
public class StockManager {

    /**
     * Gère le stock en fonction du type d'opération (ajout ou retrait).
     *
     * @param typeOperation 
     * @param produit       
     * @param quantite     
     * @param stock 
     * 
     *    */

    public void gererStock(String typeOperation, String produit, int quantite, int stock) {

        // Vérification de l'opération
        if ("L'ajout".equalsIgnoreCase(typeOperation)) {
            // Ajout au stock
            stock = ajouterAuStock(produit, quantite, stock);

        } else if ("Le retrait".equalsIgnoreCase(typeOperation)) {
            // Retrait du stock
            stock = retirerDuStock(produit, quantite, stock);
        } else {
            // Opération inconnue
            System.out.println("Opération inconnue : " + produit);
        }
    }

    /**
     * Ajoute une quantité donnée au stock.
     *
     * @param produit  
     * @param quantite 
     * @param stock    
     * @return 
     */
    private int ajouterAuStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Le Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    /**
     * Retire une quantité donnée du stock si disponible.
     *
     * @param produit  
     * @param quantite 
     * @param stock    
     * @return 
     */
    private int retirerDuStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Le Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Le stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }
}
