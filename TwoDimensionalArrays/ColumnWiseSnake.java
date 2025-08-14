package TwoDimensionalArrays;

public class ColumnWiseSnake{
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 0, 8 },//0
                { 4, 5, 6, 7, 3 },//1
                { 7, 8, 9, 2, 4 },//2
                { 6, 8, 3, 5, 2 }//3
        };


        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}