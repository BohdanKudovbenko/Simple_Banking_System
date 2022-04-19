import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        while (true) {
            Random random = new Random(k);
            for (int i = 1; i <= n; i++) {
                double gaussianNumber = random.nextGaussian();
                if (gaussianNumber <= m) {
                    if (i == n) {
                        System.out.println(k);
                        return;
                    }
                } else {
                    k++;
                    break;
                }
            }
        }
    }
}
