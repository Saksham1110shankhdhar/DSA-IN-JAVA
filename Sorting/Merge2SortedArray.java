package Sorting;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int a[]={1,3,5,7};
        int b[]={2,4,6,18,25};

        int c[]=new int[a.length+b.length];

       
        merge(a,b,c);
         print(c);

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
