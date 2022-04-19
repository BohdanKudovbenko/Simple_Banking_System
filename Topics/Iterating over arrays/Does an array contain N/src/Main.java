import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraylength = sc.nextInt();
        int[] array = new int[arraylength];

        for (int i = 0; i < arraylength; i++) {
            array[i] = sc.nextInt();
        }
        int temp = sc.nextInt();
        int sum = 0;
        for (int z : array) {
            if (z == temp) {
                sum++;
            }

        }
        System.out.println(sum > 0 ? "true" : "false");

        // put your code here
    }
}
