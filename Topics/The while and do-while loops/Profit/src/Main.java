import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyInBank = scanner.nextInt(); //  1  // 100
        double percent = scanner.nextInt();  // 100  // 15
        double moneyRequired = scanner.nextInt(); //8 // 120
        int years = 0;

        while (moneyRequired > moneyInBank) {

            moneyInBank += (moneyInBank / 100) * percent;
            years += 1;

        }
        System.out.println(years);
    }

}