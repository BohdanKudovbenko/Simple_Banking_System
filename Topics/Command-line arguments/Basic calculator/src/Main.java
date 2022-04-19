
class Problem {
    public static void main(String[] args) {
        String x = args[0];
        switch (x) {
            case "+":
                System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(args[1]) * Integer.parseInt(args[2]));
                break;
            default:
                System.out.println("Unknown operator");
                break;

        }
    }
}
