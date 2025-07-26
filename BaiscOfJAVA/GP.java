import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of terms in an A.P");

        int n=sc.nextInt();

        System.out.println("Your given Number of term is :");

        // for(int i=2;i<=3*n-1;i+=3){
        //     System.out.print(i+" ");
        // }

        // System.out.println(" ");

        // Second Method to print A.P

        int a=1 , r=2;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
            
        }
        sc.close();

    }
}

