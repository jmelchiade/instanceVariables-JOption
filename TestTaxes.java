import java.text.NumberFormat;
import java.util.Scanner;

public class TestTaxes {
    public static void main(String[] arg) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Enter your gross earning --> ");
        Scanner s = new Scanner(System.in);
        float earning = s.nextFloat();
        Taxes t = new Taxes(earning);
        t.calculateTaxes();

        String msg = "Your earning is " + nf.format(t.getEarning());
        msg += "\nCounty tax is  " + nf.format(t.getCounty());
        msg += "\nSchool tax is  " + nf.format(t.getSchool());
        msg += "\nMunicipal tax is  " + nf.format(t.getMunicipal());
        System.out.println(msg);

    }
}