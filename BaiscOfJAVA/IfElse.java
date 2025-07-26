import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter  your age :");

        Scanner sc = new Scanner(System.in);

        int age=sc.nextInt();
        System.out.println("Your age is :"+age);

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
