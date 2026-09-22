import java.util.Scanner;

class MergeSort {

    static void merge(int arr[], int low, int mid, int high) {

        int temp[] = new int[50];

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    static void mergeSort(int arr[], int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[50];
        int n;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Array after Merge Sort:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}