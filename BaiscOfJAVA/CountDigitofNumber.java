import java.util.Scanner;
public class CountDigitofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits of the Number :");

        int number=sc.nextInt();

        System.out.println("Your given number is :"+number);

        int count = 0;
        //int count = (number==0) ? count=1
        if(number==0){
            count=1;
        }

        while(number != 0){
            number /=  10;
            count++;
        }

        System.out.println("Number of digits: " + count);

         sc.close();
    }
   
}
