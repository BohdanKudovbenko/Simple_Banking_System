
class Problem {
    public static void main(String[] args) {
        int answer = -1;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}


