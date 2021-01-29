import javax.swing.JOptionPane;

public class Exercice9 {
    public static void main(String[] args) {
        double prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?"))  ;
        int quantiteAchetee = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantité achetée?"));
        double coutBrutAchat = prixUnitaire * quantiteAchetee;
        double rabais;
        if(quantiteAchetee > 5)
            rabais = 0.10 * coutBrutAchat;
        else
            rabais = 0;
        JOptionPane.showMessageDialog(null, "Coût brut le l'achat: " + coutBrutAchat + "$, montant du rabais: " + rabais + "$, coût net: " + (coutBrutAchat - rabais) + "$");

        System.exit(0);
    }
}
