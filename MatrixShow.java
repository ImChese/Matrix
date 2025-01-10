
import java.util.Scanner;

public class MatrixShow {

    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        //read and scan value rows and cols of matrix
        System.out.println("Enter Row number: ");
        rows = sc.nextInt();
        System.out.println("Enter Column number: ");
        cols = sc.nextInt();

        // Matrix
        matrix = new int[rows][cols];

        // Read matrix elements
        System.out.print("\n[" + rows + "][" + cols + "]=");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]=");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix and calculate sum
        System.out.println("Matrix inputted:");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // Print sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float) sum / (rows * cols));
    }
}
