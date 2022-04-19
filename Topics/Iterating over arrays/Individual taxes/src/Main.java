import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numCompanies = s.nextInt();
        double[] companyIncome = new double[numCompanies];
        double[] taxes = new double[numCompanies];
        int highTaxes = 0;
        double[] comparing = new double[numCompanies];


        for (int i = 0; i < numCompanies; i++) {
            companyIncome[i] = s.nextInt();
        }
        for (int i = 0; i < numCompanies; i++) {

            taxes[i] = s.nextInt();
            for (int z = 0; z < numCompanies; z++) {
                comparing[z] = (companyIncome[z] * taxes[z]) / 100;
                highTaxes = comparing[z] > comparing[highTaxes] ? z : highTaxes;
            }
        }
        System.out.println(highTaxes + 1);

    }
}
