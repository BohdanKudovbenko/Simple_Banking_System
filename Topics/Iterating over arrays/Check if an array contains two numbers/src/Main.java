import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        boolean near = false;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
                near = true;
            }


        }
        System.out.println(near);

    }
}
