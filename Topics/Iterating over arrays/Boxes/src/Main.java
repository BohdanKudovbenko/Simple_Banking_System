import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        int a = 0;
        int b = 0;
        for (int i = 0; i < box1.length; i++) {
            box1[i] = sc.nextInt();
        }
        for (int i = 0; i < box2.length; i++) {
            box2[i] = sc.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] < box2[i]) {
                a++;
            }
            if (box1[i] > box2[i]) {
                b++;
            }
        }

        if (a > 2) {
            System.out.println("Box 1 < Box 2");
        } else if (b > 2) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}

