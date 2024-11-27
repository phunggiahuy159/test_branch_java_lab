import java.util.Scanner;

public class matrices {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Input 
        System.out.println("Enter the number of rows: ");
        int rows=scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns=scanner.nextInt();

        // init
        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];

        // Input elements for both matrices
        System.out.println("Enter elements for the first matrix:");
        inputMatrix(matrix1, scanner);
        System.out.println("Enter elements for the second matrix:");
        inputMatrix(matrix2, scanner);

        // Display both matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Compute and display the sum of the matrices
        int[][] sumMatrix=addMatrices(matrix1, matrix2);
        System.out.println("Sum of Matrix 1 and Matrix 2:");
        displayMatrix(sumMatrix);

        scanner.close();
    }
    private static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
    }
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix=new int[rows][columns];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                sumMatrix[i][j]=matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
}
