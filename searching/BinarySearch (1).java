import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[50];
        int n, search;
        int low, high, mid;
        int found = 0;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        search = sc.nextInt();

        low = 0;
        high = n - 1;

        while (low <= high) {

            mid = (low + high) / 2;

            if (arr[mid] == search) {
                System.out.println("Element found at position " + (mid + 1));
                found = 1;
                break;
            }

            else if (search < arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}