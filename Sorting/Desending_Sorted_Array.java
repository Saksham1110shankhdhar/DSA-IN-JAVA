package Sorting;


public class Desending_Sorted_Array {

    public static void Desecending(int arr[],int target){

        int n=arr.length;
        int left=0, right=n-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<target){
               right=mid-1;
            }
            else if(arr[mid]>target){
                left=mid+1;
            }
            else{
                System.out.println("Element found at index: "+mid);
                return;
                
            }
        }    
    }
    
    public static void printArray(int arr[]) {
       for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[]={100,81,65,60,45,32,23,19};

          printArray(arr);

       

        Desecending(arr, 100);
        
    }
}
