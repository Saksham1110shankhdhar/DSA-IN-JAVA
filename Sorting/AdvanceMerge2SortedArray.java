package Sorting;

public class AdvanceMerge2SortedArray {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7 };
        int b[] = { 2, 4, 6, 18, 25 };

        int c[] = new int[a.length + b.length];

        merge(a, b, c);
        print(c);
    }

    private static void print(int[] c) {
        for(int ele:c){
        System.out.print(ele+" ");
      }
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;

        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }else{
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if(i==-1){
            while(j>=0){
                 c[k]=b[j];
                j--;
                k--;
            }
        }
        else{
            while(i>=0){
                 c[k]=a[i];
                i--;
                k--;
            }
        }
    }
}
