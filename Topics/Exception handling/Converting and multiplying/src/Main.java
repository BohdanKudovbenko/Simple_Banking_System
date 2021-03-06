import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //while (!scanner.nextLine().equals("0")) {
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("0")) {
                break;
            }
            try {
                System.out.println(Integer.parseInt(input) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}