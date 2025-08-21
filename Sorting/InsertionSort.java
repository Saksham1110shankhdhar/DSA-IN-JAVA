package Sorting;

public class InsertionSort {

    public static void Insertion(int arr[]){

        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }


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

        Insertion(arr);
       

        System.out.print("Sorted array: ");

        printArray(arr);
    }
}
