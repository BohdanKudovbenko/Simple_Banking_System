import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                               //Length of array
        int[] ar = new int[n];                              //Declaring array
        for (int i = 0; i < n; i++) {                       //Initializing array
            ar[i] = sc.nextInt();
        }
        int count = 1;                                      //Variable to count ascending numbers
        int max = 0;                                        //Variable to store max count
        for (int i = 1; i < n; i++) {
            if (ar[i] > ar[i - 1]) {                        //if prev elem < current elem then it is in ascending order
                count++;                                    //Hence, increment the count
            } else {
                if (max < count) {                          //if not, then store the max count value and start from 1.
                    max = count;
                }
                count = 1;
            }
        }
        System.out.print(max > count ? max : count);        //Display the max of count and max values
    }
}