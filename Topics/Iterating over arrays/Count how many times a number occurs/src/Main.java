import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = sc.nextInt();
        }
        int searchingFor = sc.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == searchingFor) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}