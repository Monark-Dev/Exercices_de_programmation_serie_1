import javax.swing.JOptionPane;

public class Exercice10 {
    public static void main(String[] args) {
        if(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantité achetée?")) > 5)
            JOptionPane.showMessageDialog(null, "Coût net de l'achat: " + Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?")) * Integer.parseInt(JOptionPane.showInputDialog(null, "C'est quoi déjà la quantité achetée?")) * 0.9);
        else
            JOptionPane.showMessageDialog(null, "Coût net de l'achat: " + Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?")) * Integer.parseInt(JOptionPane.showInputDialog(null, "C'est quoi déjà la quantité achetée?")));

        System.exit(0);
    }
}
