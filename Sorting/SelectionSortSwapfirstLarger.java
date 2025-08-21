package Sorting;

public class SelectionSortSwapfirstLarger {
    
    public static void largerElement(int arr[]){

        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            int max=Integer.MIN_VALUE;
            int maxIdx=-1;

            for(int j=i;j>=0;j--){
                if(arr[j]>max){
                    max=arr[j];
                    maxIdx=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
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

        largerElement(arr);

       

        System.out.print("Sorted array: ");

        printArray(arr);

    
    }
}
