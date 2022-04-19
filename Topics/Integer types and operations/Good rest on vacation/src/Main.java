import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysDuration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlyCost = scanner.nextInt();
        int costPerNight = scanner.nextInt();
        int sum = oneWayFlyCost * 2 + (daysDuration - 1) * costPerNight + daysDuration * foodCostPerDay;

        System.out.println(sum);
    }
}
