package TwoDimensionalArrays;

public class ColumnWisePrint {
    public static void main(String[] args) {
         int arr[][]= {
            {1, 2, 3,0},
            {4, 5, 6,7},
            {7, 8, 9,2}
        };

       
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
