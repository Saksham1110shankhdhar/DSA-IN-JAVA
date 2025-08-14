package TwoDimensionalArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
         int arr[][] = {
                { 1, 2, 3, 0 },//0
                { 4, 5, 6, 7 },//1
                { 7, 8, 9, 2 },//2
                { 6, 8, 3, 5}//3
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println();

        //Second Method 

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
           
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
