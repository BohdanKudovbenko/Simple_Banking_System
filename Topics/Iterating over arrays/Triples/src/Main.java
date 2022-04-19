import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int len = scan.nextInt();
        int triple = 0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
            if (i > 1 && arr[i] == arr[i - 1] + 1 && arr[i - 1] == arr[i - 2] + 1) {
                triple++;
            }
        }
        System.out.println(triple);
    }
}
