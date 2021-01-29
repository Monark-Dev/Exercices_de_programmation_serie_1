import javax.swing.JOptionPane;

public class Exercice10 {
    public static void main(String[] args) {
        int quantiteAchetee = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantité achetée?"));
        if(quantiteAchetee > 5)
            JOptionPane.showMessageDialog(null, "Coût net de l'achat: " + Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?")) * quantiteAchetee * 0.9);
        else
            JOptionPane.showMessageDialog(null, "Coût net de l'achat: " + Double.parseDouble(JOptionPane.showInputDialog(null, "Prix unitaire?")) * quantiteAchetee);

        System.exit(0);
    }
}
