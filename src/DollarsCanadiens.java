import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

public class DollarsCanadiens {
    public static void main(String[] args) throws IOException{
        BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Combien?");
        Double montant = Double.parseDouble(clavier.readLine());
        String montantDollar = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH).format(montant);
        System.out.println(montantDollar);
    }
}
