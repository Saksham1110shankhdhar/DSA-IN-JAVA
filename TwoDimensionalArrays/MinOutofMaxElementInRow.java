package TwoDimensionalArrays;

public class MinOutofMaxElementInRow {
    public static void main(String[] args) {
         int arr[][]= {
            {1, 2, 3},
            {4, 51, 6},
            {7, 8, 9}
        };

        int MinOfMax = Integer.MAX_VALUE;


        int rowNum=0;

        for(int i=0;i<arr.length;i++){
            int MaxInrow=0;
            for(int j=0;j<arr[0].length;j++){
              if(MaxInrow<arr[i][j]){
                  MaxInrow=arr[i][j];
              }
            }

            if(MaxInrow<MinOfMax){
                MinOfMax=MaxInrow;
                rowNum=i;
            }
            
        }
        System.out.println("Maximum Element in Row of 2D array is " + MinOfMax+ " at row number " + rowNum );
    }
}
