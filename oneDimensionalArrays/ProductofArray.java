package oneDimensionalArrays;

import java.util.Scanner;

public class ProductofArray {
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

        int Product=1;

        for(int i=0;i<n;i++){
            Product*=arr[i];
        }
        System.out.print("Product of Array is : "+Product);



        sc.close();
    }
}
