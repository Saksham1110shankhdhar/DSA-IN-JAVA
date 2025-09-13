package Recursion;

public class PrintElementOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        print(arr,0);
    }

    private static void print(int[] arr, int i) {
        if(i==arr.length){
            return ;
        }
        System.out.println(arr[i]);
        print(arr,i+1);
    }
}
