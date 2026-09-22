import java.util.Scanner;

class ArrayMerging {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[50];
        int arr2[] = new int[50];
        int merge[] = new int[100];

        int n1, n2;

        System.out.print("Enter number of elements in first array: ");
        n1 = sc.nextInt();

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        n2 = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merge[n1 + i] = arr2[i];
        }

        System.out.println("Merged array:");

        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(merge[i] + " ");
        }

        sc.close();
    }
}