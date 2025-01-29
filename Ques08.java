import java.util.Scanner;

public class Ques08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
        int reversed = 0;
        int sign = (N < 0) ? -1 : 1;
        N = Math.abs(N);
        while (N != 0) {
            int digit = N % 10;
            N /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
                return;
            }

            reversed = reversed * 10 + digit;
        }
        reversed *= sign;
        System.out.println("Reversed integer: " + reversed);
        scanner.close();
    }
}
