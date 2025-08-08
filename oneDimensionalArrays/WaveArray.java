package oneDimensionalArrays;

import java.util.Scanner;



public class WaveArray {

    public static void sortInWave(int arr[]) {
        
        int n= arr.length;
        
        for(int i=0;i<n-1;i+=2){
               int temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");

        int n= sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Your given Array is : ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("Wave Form Array is : ");

        sortInWave(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
       
    }
}
