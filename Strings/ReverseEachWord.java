package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="Saksham is a Great Guy";
        StringBuilder sb = new StringBuilder(s);

        //int arr[]={1,2,3,4,5};

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        reverseEachWord(sb);

       

        System.out.println(sb);


    }

    private static void reverseEachWord(StringBuilder sb) {
       
      int i=0, j=0;

      while(j<sb.length()){
        if(sb.charAt(j)!=' '){
            j++;
        }else{
            reverse(sb, i, j-1);
            j++;
            i=j;
        }
      }
      reverse(sb, i, j-1);
    }

    private static void reverse( StringBuilder sb,int i,int j) {
       
        while(i<j){
            char ti=sb.charAt(i);
            char tj=sb.charAt(j);

            sb.setCharAt(i, tj);
            sb.setCharAt(j, ti);

            i++;
            j--;
        }
     }
}
