import java.util.Scanner;

class Transpose {
    public static void main(String[] args) {

        // declare variables
        int[][] matrix;
        int[][] transpose;
        int sum = 0, r, c;

        // Scanner class object to read input values
        Scanner in = new Scanner(System.in);

        // read size of matrix from user
        System.out.print("Enter the Number of Rows : ");
        r = in.nextInt();

        System.out.print("nter the Number of Columns : ");
        c = in.nextInt();

        if (r != c) {
            System.out.println("Only square matrix allowed.");
        } else {
            // initialize matrix
            matrix = new int[r][c];
            transpose = new int[c][r];

            // read matrix elements from user
            System.out.print("Enter the Elements of Matrix : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            // print entered matrix
            System.out.println("\nGiven Matrix");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }

            // find transpose and sum of dioganal elements
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    transpose[j][i] = matrix[i][j];
                    if (i == j) {
                        sum = sum + (matrix[i][j]);
                    }
                }
            }

            // display result
            System.out.println("\nThe Trace of the Given Matrix is = " + sum);
            System.out.println("\nTranspose Matrix");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}