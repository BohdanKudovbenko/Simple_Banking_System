import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long scannedNum = scanner.nextLong();
        long wanted = 1;
        int count = 0;
        while (scannedNum >= wanted) {
            wanted = ++count * wanted;
        }
        System.out.println(count);
    }

}
