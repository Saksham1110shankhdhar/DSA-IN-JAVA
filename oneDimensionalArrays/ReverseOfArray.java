package oneDimensionalArrays;

public class ReverseOfArray {

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={5, 4, 3, 2, 1};

        for(int ele:arr){
            System.out.print( ele + " ");
        }
        System.out.println();
        reverse(arr);
         for (int num : arr) {
            System.out.print(num + " ");
        }
       
        
    }
}
