import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();
        int index = nums.length - shift % nums.length;
        for (int i = 0; i < nums.length; ++i) {
            if (index + i >= nums.length) {
                index -= nums.length;
            }
            System.out.print(nums[index + i] + " ");
        }
    }
}
