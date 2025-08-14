package TwoDimensionalArrays;

public class ReverseRowInMatrix {
    public static void main(String[] args) {
         int arr[][] = {
                { 1, 2, 3, 0, 8 },//0
                { 4, 5, 6, 7, 3 },//1
                { 7, 8, 9, 2, 4 },//2
                { 6, 8, 3, 5, 2 }//3
        };
        for(int i=0;i<arr.length;i++){
           for(int j=arr[0].length-1;j>=0;j++){
               System.out.print(arr[i][j]+" ");
           }
       }

          for (int i = 0; i < arr.length; i++) {
            int left = 0, right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println();

        for(int j=0; j<arr[0].length;j++){
            int top=0, bottom=arr.length-1;
            while(top<bottom){
                int temp=arr[top][j];
                arr[top][j]=arr[bottom][j];
                arr[bottom][j]=temp;
                top++;
                bottom--;
            }
           
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
