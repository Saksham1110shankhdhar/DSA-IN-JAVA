package TwoDimensionalArrays;

import java.util.Scanner;

public class BasicOF2dArrays{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
          
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }    
                System.out.println();
        }

        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter number of columns:");
        int m=sc.nextInt();

        int newArray[][]=new int[n][m];

        
        for(int i=0;i<newArray.length;i++){
            for(int j=0;j<newArray[i].length;j++){
                newArray[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your 2D array is:");

        for(int i=0;i<newArray.length;i++){
            for(int j=0;j<newArray[i].length;j++){
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}