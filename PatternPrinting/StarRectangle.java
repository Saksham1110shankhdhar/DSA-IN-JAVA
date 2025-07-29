package PatternPrinting;
import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns : ");

        int col = sc.nextInt();

        for(int i=1; i<=rows;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
         
        sc.close();
    }
    
}

