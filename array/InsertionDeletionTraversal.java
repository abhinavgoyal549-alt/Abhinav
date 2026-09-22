import java.util.Scanner;

class InsertionDeletionTraversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[50];
        int n, choice, pos, value;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Traversal");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter position: ");
            pos = sc.nextInt();

            System.out.print("Enter value: ");
            value = sc.nextInt();

            if (n >= arr.length) {
                System.out.println("Array is full");
            }
            else if (pos < 1 || pos > n + 1) {
                System.out.println("Invalid position");
            }
            else {
                for (int i = n - 1; i >= pos - 1; i--) {
                    arr[i + 1] = arr[i];
                }

                arr[pos - 1] = value;
                n++;

                System.out.println("Array after insertion:");

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        else if (choice == 2) {

            System.out.print("Enter position: ");
            pos = sc.nextInt();

            if (pos < 1 || pos > n) {
                System.out.println("Invalid position");
            }
            else {
                for (int i = pos - 1; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                n--;

                System.out.println("Array after deletion:");

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

        else if (choice == 3) {

            System.out.println("Array elements:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        else {
            System.out.println("Wrong choice");
        }

        sc.close();
    }
}