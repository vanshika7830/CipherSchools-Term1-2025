import java.util.Scanner;

public class Ques09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int rowWithMaxSum = -1;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int num : array[i]) {
                rowSum += num;
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowWithMaxSum = i + 1; // 1-based indexing
            }
        }

        System.out.println("Row with the maximum sum: " + rowWithMaxSum);
        System.out.println("Maximum sum: " + maxSum);

        scanner.close();
    }
}
