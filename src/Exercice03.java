import javax.swing.JOptionPane;

public class Exercice03 {
    public static void main(String[] args) throws Exception {
        int nombreDeKilometresParcourus = Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre de kilomètres parcourus par la voiture?"));
        int nombreDeLitresConsommes = Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre de litres consommés?"));
        float consommation = nombreDeKilometresParcourus / nombreDeLitresConsommes;
        JOptionPane.showMessageDialog(null, "La consommation de la voiture est de " + consommation + " KM par litre");
    }
}
