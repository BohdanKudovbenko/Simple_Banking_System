import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String str1 = new Scanner(System.in).next();
        String str2 = new StringBuilder(str1).reverse().toString();
        System.out.println(str1.equals(str2) ? 1 : 77);
    }
}
