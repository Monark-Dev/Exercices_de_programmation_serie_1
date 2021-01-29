import javax.swing.JOptionPane;

public class Exercice02 {
    public static void main(String[] args) throws Exception {

        // constante
        final double TAUX_DE_TAXE = 15.56;
        
        // lire des données variables
        int numeroDuProduit = Integer.parseInt(JOptionPane.showInputDialog(null, "Numéro du produit?"));
        double prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?"))  ;
        int quantiteAchetee = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantité achetée?"));

        // calculer et afficher le prix total à débourser
        double prixTotalavantTaxes = prixUnitaire * quantiteAchetee;
        double taxesTotales =  prixTotalavantTaxes * TAUX_DE_TAXE / 100;
        double prixTotalTaxesIncluses = prixTotalavantTaxes + taxesTotales;
        JOptionPane.showMessageDialog(null, "Le prix total incluant les taxes pour l'achat de "
            + quantiteAchetee + " x produit# " + numeroDuProduit + " est de: " + prixTotalTaxesIncluses + "$");

        System.exit(0);  
    }
}
