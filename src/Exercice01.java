import javax.swing.JOptionPane;

public class Exercice01 {
    public static void main(String[] args) throws Exception {
        // données
        final int HauteurRezDeChaussee = 6;
        final int HauteurEtage = 4;
        String saisie;
        int nbEtages;
        int hauteurEdifice;

        // lecture du nombre d'étages
        saisie = JOptionPane.showInputDialog("Quel est le nombre d'étages de l'édifice?");
        nbEtages = Integer.parseInt(saisie);
        hauteurEdifice = HauteurRezDeChaussee + HauteurEtage * (nbEtages - 1);

        // calcul et afficher la hauteur
        JOptionPane.showMessageDialog(null, "La hauteur de l'édifice est de " + hauteurEdifice + " mètres");

        System.exit(0);
    }
}

