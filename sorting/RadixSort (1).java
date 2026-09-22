import java.util.Scanner;

class RadixSort {

    static int getMax(int arr[], int n) {

        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static void countingSort(int arr[], int n, int place) {

        int output[] = new int[50];
        int count[] = new int[10];

        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {

            output[count[(arr[i] / place) % 10] - 1] = arr[i];

            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[], int n) {

        int max = getMax(arr, n);

        for (int place = 1; max / place > 0; place = place * 10) {
            countingSort(arr, n, place);
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

        radixSort(arr, n);

        System.out.println("Array after Radix Sort:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}