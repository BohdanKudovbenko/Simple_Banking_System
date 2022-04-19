import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] seats = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                seats[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < row; i++) {
            count = 0;
            for (int j = 0; j < col; j++) {
                if (seats[i][j] == 0) {
                    count++;
                } else {
                    count = 0;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
            if (maxCount >= k) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(0);
    }
}
