import java.util.Scanner;

class MatrixSubtraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int sub[][] = new int[10][10];

        int rows, columns;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Matrix after subtraction:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}