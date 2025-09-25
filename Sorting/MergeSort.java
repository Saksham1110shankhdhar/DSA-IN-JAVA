package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={38,27,43,3,9,82,10};

        print(arr);
        mergeSort(arr);
        System.out.println();
        print(arr);
    }

     private static void mergeSort(int[] arr) {

            if (arr.length <= 1) {   // base case
                return;
            }

        int n= arr.length;

        int a[]=new int[n/2];

        int b[]=new int[n-n/2];

        for(int i=0; i<a.length; i++){
            a[i]=arr[i];
        }

        for(int i=0; i<b.length; i++){
            b[i]=arr[i+n/2];
        }

        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
        
    }

     private static void print(int[] c) {
      for(int ele:c){
        System.out.print(ele+" ");
      }
    }

    private static void merge(int[] a, int[] b, int[] c) {
       
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }

        if(i==a.length){
            while(j<b.length){
                 c[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<a.length){
                 c[k]=a[i];
                i++;
                k++;
            }
        }

    }
}
