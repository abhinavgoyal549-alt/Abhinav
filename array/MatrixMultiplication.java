import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int mul[][] = new int[10][10];

        int rows1, columns1, rows2, columns2;

        System.out.print("Enter rows of first matrix: ");
        rows1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        columns1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        rows2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        columns2 = sc.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
        }
        else {

            System.out.println("Enter elements of first matrix:");

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix:");

            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < columns2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {

                    mul[i][j] = 0;

                    for (int k = 0; k < columns1; k++) {
                        mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Matrix after multiplication:");

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}