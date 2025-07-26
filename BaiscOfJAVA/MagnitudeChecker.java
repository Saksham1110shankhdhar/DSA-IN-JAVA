import java.util.Scanner;

public class MagnitudeChecker {
    public static void main(String[] args) {

        System.out.println("Take an Integer Number :");

        Scanner sc =new Scanner(System.in);

        long number=sc.nextInt();

        System.out.println("Your Given number is :"+number);
        
            number=Math.abs(number);

        if( number<69){

            System.out.println("Congratulation Mangnitude of given number is :"+number+"smaller than 69");
        } else{
            System.out.println("Sorry, Your given  Number whose Magnitude is not less than 69");
        }
         sc.close();

    }
}
