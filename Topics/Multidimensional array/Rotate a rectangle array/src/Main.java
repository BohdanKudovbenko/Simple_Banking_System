import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] multiDemArray = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                multiDemArray[row][col] = sc.nextInt();
            }
        }
        for (int j = 0; j < multiDemArray[multiDemArray.length - 1].length; j++) {
            for (int i = multiDemArray.length - 1; i >= 0; i--) {
                System.out.print(multiDemArray[i][j] + " ");
            }
            System.out.print("\n");


        }
    }
}
