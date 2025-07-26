import java.util.Scanner;
public class SideCheckerofTriangle{
    public static void main(String[] args) {
        System.out.println("Enter the Sides of Triangle");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number A :");
        int A=sc.nextInt();
         System.out.println("Enter number B :");
        int B=sc.nextInt();
         System.out.println("Enter number C :");
        int C=sc.nextInt();

        if((A+B>C) && (A+C>B) && (B+C>A)){
            System.out.println("These are the accurate sides of triangle");
        }else{
            System.out.println("Soory these sides are not follow the property of triangle ");
        }
        sc.close();
    }
}