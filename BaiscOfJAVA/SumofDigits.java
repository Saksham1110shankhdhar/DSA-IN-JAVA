import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Digits of Number :");

        int num= sc.nextInt();

        System.out.println("Your given Digits is : "+num);

        int sum=0;

        while(num!=0){
            int lastDigit = num%10 ;
            sum+=lastDigit;
            num/=10;
        }

        System.out.println("The Sum of Digit is : "+sum);

        sc.close();
    }
}
