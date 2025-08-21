package Sorting;

public class SelectionSort {

    public static void Selectionsort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // public static void selectionSort(int arr[]) {
    // int n = arr.length;

    // for (int i = 0; i < n - 1; i++) {
    // int minIdx = i; // assume current i is the smallest

    // for (int j = i + 1; j < n; j++) {
    // if (arr[j] < arr[minIdx]) {
    // minIdx = j; // update min index
    // }
    // }

    // // swap
    // int temp = arr[i];
    // arr[i] = arr[minIdx];
    // arr[minIdx] = temp;
    // }
    // }

    public static void printArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 1, 6, 2, 5, 3, 4 };

        printArray(arr);

        System.out.println();

        Selectionsort(arr);

        System.out.print("Sorted array: ");

        printArray(arr);

    }
}
