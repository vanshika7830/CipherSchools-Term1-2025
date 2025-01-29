import java.util.Scanner;

public class Ques03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total cart amount: ");
        double totalAmount = scanner.nextDouble();
        double discount = (totalAmount > 5000) ? totalAmount * 0.20
                : (totalAmount >= 3000 && totalAmount <= 5000) ? totalAmount * 0.10 : 0;
        double finalAmount = totalAmount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
        scanner.close();
    }
}