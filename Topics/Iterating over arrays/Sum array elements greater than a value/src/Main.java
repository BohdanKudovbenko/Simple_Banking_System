import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int arrayLen = sc.nextInt();
        int[] array = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            array[i] = sc.nextInt();
        }
        int temp = sc.nextInt();
        int sum = 0;
        for (int num : array) {
            if (num > temp) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
