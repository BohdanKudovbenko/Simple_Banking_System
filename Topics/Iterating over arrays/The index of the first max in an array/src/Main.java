import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLenght = sc.nextInt();
        int[] array = new int[arrayLenght];
        int largest = 0;
        for (int index = 0; index < arrayLenght; index++) {
            array[index] = sc.nextInt();
            largest = array[index] > array[largest] ? index : largest;
        }
        System.out.println(largest);
    }
}
