import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int currentPermissions = scanner.nextInt();

        System.out.print("Enter the bit position to toggle (0-3): ");
        int bitPosition = scanner.nextInt();

        System.out.println("Original permissions: "
                + String.format("%4s", Integer.toBinaryString(currentPermissions)).replace(' ', '0'));

        currentPermissions ^= (1 << bitPosition);

        System.out.println("Updated permissions: "
                + String.format("%4s", Integer.toBinaryString(currentPermissions)).replace(' ', '0'));

        scanner.close();
    }
}
