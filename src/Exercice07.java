import javax.swing.JOptionPane;

public class Exercice07 {
    public static void main(String[] args) {
        int nombre1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez un premier nombre:"));
        int nombre2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez un deuxième nombre:"));
        if(nombre1 > nombre2)
            JOptionPane.showMessageDialog(null, nombre1 + " est le plus grand nombre");
        else if(nombre1 < nombre2)
            JOptionPane.showMessageDialog(null, nombre2 + " est le plus grand nombre");
        else
            JOptionPane.showMessageDialog(null, "Vous êtes idiot!");

        System.exit(0);  
    }
}
