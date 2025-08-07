package oneDimensionalArrays;

import java.util.Arrays;

public class ShallowCopyandDeepCopy {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,7};

        int newArr[]=arr;// Shallow Copy
        newArr[0]=100;
        System.out.println(arr[0]);

        int Array[]=Arrays.copyOf(arr,arr.length);// Deep Copy
        Array[0]=500;

        System.out.println(arr[0]);
        System.out.println(Array[0]);


        // Another Example of Deep Copy

        int deep[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            deep[i]=arr[i];

            System.out.print(deep[i]+" ");
        }
        
    }
}
