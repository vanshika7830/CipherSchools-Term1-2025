import java.util.Scanner;

public class Ques07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string S1: ");
        String S1 = scanner.nextLine();
        
        System.out.print("Enter string S2: ");
        String S2 = scanner.nextLine();
        
        if (S1.length() != S2.length()) {
            System.out.println("false");
        } else {
            String concatenated = S1 + S1;
            if (concatenated.contains(S2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        
        scanner.close();
    }
} 
  

