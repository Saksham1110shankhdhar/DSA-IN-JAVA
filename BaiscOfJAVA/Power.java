import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the base of number: ");

        int base=sc.nextInt();

        System.out.println("Your given Digits of number is :"+base);

        System.out.println("Enter the Exponent of number: ");

        int expo=sc.nextInt();

        System.out.println("Your given Digits of number is :"+expo);

        double power=1;

        for(int i=1;i<=expo;i++){
            if(base==1){
                break;
            }
            power *= base;
        }

        if(base==0 && expo==0){
            System.out.println("Not Defined");
        }

        System.out.println(power);

        sc.close();
    }
}
