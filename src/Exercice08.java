import javax.swing.JOptionPane;

public class Exercice08 {
    public static void main(String[] args) {
        int noteEtudiant = Integer.parseInt(JOptionPane.showInputDialog(null, "Note de l'étudiant sur 20 ?"));
        int noteEtudiantSur100 = noteEtudiant * 5;
        if(noteEtudiantSur100 >= 60) 
            JOptionPane.showMessageDialog(null, "L'étudiant a obtenu " + noteEtudiantSur100 + "% Bravo!");
        else
            JOptionPane.showMessageDialog(null, "L'étudiant a obtenu " + noteEtudiantSur100 + "%");

         System.exit(0);
    }   
}
