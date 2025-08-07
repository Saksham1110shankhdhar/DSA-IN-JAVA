package oneDimensionalArrays;

public class PrintNegativeElement {
    public static void main(String[] args) {
        int arr[] = { 4, -8, 9, 6, -7, -3, 1, -81 };

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
