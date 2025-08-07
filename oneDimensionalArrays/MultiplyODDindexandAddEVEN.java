package oneDimensionalArrays;

public class MultiplyODDindexandAddEVEN {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 1, 2 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                arr[i]*=2;
            }else{
               arr[i]+=10;
            }

            System.out.print(arr[i]  + " ");
        }
       
    }

}
