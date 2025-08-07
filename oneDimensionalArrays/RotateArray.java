package oneDimensionalArrays;

public class RotateArray {

    public static void reverseofArray(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArray(int arr[], int k) {
        int n = arr.length;


        k = k % n; // In case k is greater than the length of the array
        
        // Step 1: Reverse first part (0 to n-k-1)
        reverseofArray(arr, 0, n - k - 1);
        // Step 2: Reverse second part (n-k to n-1)
        reverseofArray(arr, n - k, n - 1);
        // Step 3: Reverse whole array
        reverseofArray(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        // Rotate array by k positions
        rotateArray(arr, k);

        // Print rotated array
        for (int p = 0; p < arr.length; p++) {
            System.out.print(arr[p] + " ");
        }
    }
}
