package evenOdd;

public class evenOd {
    public static void main(String[] args) {
        for (int i = 0; args.length > i; i++) {
            if (Integer.parseInt(args[i]) % 2 != 0) {
                System.out.println(Integer.parseInt(args[i]));
            } else {
                System.out.println("Число чьотне, потрібне інше!");
            }
        }
    }
}
