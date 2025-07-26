import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Digits of the Number : ");

        int num=sc.nextInt();

        System.out.println("Your given Digits of number is :"+num);

        int reverse=0;


        while(num!=0){
            reverse*=10;
            reverse += num%10;
            num /=10;
        }
        System.out.println(reverse);

        sc.close();
    }
}
