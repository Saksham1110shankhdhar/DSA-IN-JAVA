package TwoDimensionalArrays;

public class PrintingUsingForEach {
    public static void main(String[] args) {
        int arr[][]= {
            {1, 2, 3},
            {4, 51, 6},
            {7, 8, 9}
        };

        for(int i=0;i<arr.length;i++){
            for(int ele:arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // Second way using for-each loop

        for(int[]a:arr){
            for(int ele:a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
