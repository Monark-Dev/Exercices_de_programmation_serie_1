import javax.swing.JOptionPane;

public class Exercice5 {
    public static void main(String[] args) {
        final double TAUX_DE_TAXE = 15.56;
        final double TARIF_PAR_JOUR = 0.50;
        final double TARIF_PAR_KILOWATTHEURE = 0.30;
        int numeroDuClient = Integer.parseInt(JOptionPane.showInputDialog(null, "Numéro du client ?"));
        int nombreDeJoursDeConsommation = Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre de jours de consommation ?"));
        int nombreDeKilowattheures = Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre de Kilowattheures consommés ?"));
        JOptionPane.showMessageDialog(null,
            "Numéro du Client: " + numeroDuClient + ", Le Total de la facture après les taxes: " + (TARIF_PAR_JOUR * nombreDeJoursDeConsommation + TARIF_PAR_KILOWATTHEURE * nombreDeKilowattheures) * (1 + TAUX_DE_TAXE / 100)
            );
        System.exit(0);
    }
}