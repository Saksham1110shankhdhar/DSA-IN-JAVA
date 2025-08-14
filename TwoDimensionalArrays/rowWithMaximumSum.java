package TwoDimensionalArrays;

public class rowWithMaximumSum {
    public static void main(String[] args) {
        int arr[][]= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int Maxsum=Integer.MIN_VALUE;

        int rowNum=0;

        for(int i=0;i<arr.length;i++){
            int Rowsum=0;
            for(int j=0;j<arr[0].length;j++){
               Rowsum+=arr[i][j];
            }

            if(Rowsum>Maxsum){
                Maxsum=Rowsum;
                rowNum=i;
            }
            
        }
        System.out.println("Maximum Sum of Row in 2D array is " + Maxsum+ " at row number " + rowNum );
    }
}

