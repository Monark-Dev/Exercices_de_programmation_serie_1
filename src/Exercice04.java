import javax.swing.JOptionPane;

public class Exercice04 {
    public static void main(String[] args) {
        int chiffre1;
        int chiffre2;
        int chiffre3;
        int chiffre4;
        int reste;
        int nombre = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre de 4 chiffres:"));
        chiffre1 = nombre / 1000;
        reste = nombre % 1000;
        chiffre2 = reste / 100;
        reste = reste % 100;
        chiffre3 = reste / 10;
        chiffre4 = reste % 10;
        JOptionPane.showMessageDialog(null, chiffre1 + " " + chiffre2 + " " + chiffre3 + " " + chiffre4);
        
        System.exit(0);
    }
}
