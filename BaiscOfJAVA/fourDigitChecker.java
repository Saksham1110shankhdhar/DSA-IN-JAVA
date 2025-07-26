import java.util.Scanner;

public class fourDigitChecker {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter  4 Digit Positive Number : ");

        long number=sc.nextInt();

        if(number>999 && number<10000 ){
            System.out.println("Congratulation , Your Number is Four Digit");
        }else{
            System.out.println("Soory, Check Another one");
        }
         sc.close();
    }
}
