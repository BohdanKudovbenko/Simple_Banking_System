import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
            if (i > 0) {
                temp = array[i] * array[i - 1] > temp ? array[i] * array[i - 1] : temp;
            }

        } System.out.println(temp);

    }
}
