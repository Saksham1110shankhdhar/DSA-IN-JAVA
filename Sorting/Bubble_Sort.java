package Sorting;

public class Bubble_Sort {

    public static void bubblesort(int []arr){


        int n=arr.length;

        for(int i=0; i<n-1; i++){
            boolean flag=true;
            // Optimization: If no two elements were swapped, the array is sorted
            for(int j=0; j<n-1-i; j++){

                 if(arr[j]>arr[j+1]){
                    flag=false;
                 }
              
                if(arr[j]>arr[j+1]){
                    
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==true) break; // If no swaps occurred, break out of the loop
        }
    }
    
    public static void printArray(int arr[]) {
       for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[]={1,6,2,5,3,4};

          printArray(arr);

          System.out.println();

        bubblesort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
        
    }
}
