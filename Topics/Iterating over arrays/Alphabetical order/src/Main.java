import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        boolean check = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) <= 0) {
                check = true;
            } else {
                check = false;
            }
        }
        System.out.println(check);
    }
}
