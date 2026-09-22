import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[50];
        int n, key, j;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {

            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Array after Insertion Sort:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}