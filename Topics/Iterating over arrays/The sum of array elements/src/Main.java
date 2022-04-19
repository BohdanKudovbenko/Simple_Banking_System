import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();

        int[] array = new int[numberOfElements];
        int sum = 0;

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}