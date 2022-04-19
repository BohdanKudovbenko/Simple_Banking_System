import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] array = new int[input];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        boolean ascending = true;

        for (int i = 1; i <= array.length - 1; i++) {
            if (array.length == 1) {
                ascending = true;
            } else if (array[i - 1] <= array[i]) {
                ascending = true;
            } else {
                ascending = false;
                break;
            }
        }
        System.out.println(ascending);
    }
}