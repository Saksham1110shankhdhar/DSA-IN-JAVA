package oneDimensionalArrays;

import java.util.Scanner;

public class MaxElement {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of Array");

        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Elements of Array");

        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        System.out.print("Provided Array is : ");
         for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }

        System.out.println();

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Maximum Element of Array is : "+max);

        // Second Method

        System.out.println();

        int maxi=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=Math.max(arr[i],max);
            }
        }
        System.out.print("Maximum Element of Array is : "+maxi);



        sc.close();
    }
}
