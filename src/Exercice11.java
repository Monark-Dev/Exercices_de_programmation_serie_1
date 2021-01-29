import javax.swing.JOptionPane;

public class Exercice11 {
    public static void main(String[] args) {
        double noteFinale;

        int note1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Note sur 100  pour l'examen 1 ?"));
        int note2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Note sur 100  pour l'examen 2 ?"));
        int note3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Note sur 100 pour l'examen 3 ?"));

        noteFinale = note1 * 0.20 + note2 * 0.35 + note3 * 0.45;

        if(noteFinale >= 60)
            JOptionPane.showMessageDialog(null, "Note finale: " + noteFinale + "% Succès!");
        else
            JOptionPane.showMessageDialog(null, "Note finale: " + noteFinale + "% Échec!");

        System.exit(0);
    }
}
