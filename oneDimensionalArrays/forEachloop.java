package oneDimensionalArrays;

import java.util.Arrays;

public class forEachloop {
    public static void main(String[] args) {
        int arr[]={1,2,32,43,23};

        for(int ele:arr){
            System.out.print(ele+" ");
        }

        Arrays.sort(arr);

        System.out.println();

        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
