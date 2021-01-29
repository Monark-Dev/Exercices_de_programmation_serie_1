import javax.swing.JOptionPane;

public class Exercice6 {
    public static void main(String[] args) {
        int distanceEnKm = Integer.parseInt(JOptionPane.showInputDialog("Entrez la distance en KM:"));
        int kmParLitre = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre de Km/litre:"));
        double prixEssence = Double.parseDouble(JOptionPane.showInputDialog("Entrez le prix de l'essence au litre:"));
        JOptionPane.showMessageDialog(null, "le coût du déplacement pour faire ce voyage est de " + distanceEnKm / kmParLitre * prixEssence + "$");
        System.exit(0);
    }
}
