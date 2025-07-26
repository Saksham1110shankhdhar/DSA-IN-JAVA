import java.util.Scanner;

public class Baisc{
    public static void main(String[] args) {
        System.out.println("Hellow World");
        System.out.println("Saksham is Doing great in CS branch");

        int num=45;//This i Integer
        System.out.println("The number is :"+num);

        int x=23;
        x=x+23;

        System.out.println("The value of x is :"+x);

        // Modulo Operator
        int y=10%3; // 10 divided by 3 gives remainder 1
        System.out.println("The value of y is :"+y);

        int n=2;
        int m=3;
        int divide=n%m; // 2 divided by 3 gives remainder 2
        System.out.println("The value of divide is :"+divide);

        int numbs=7;
        int numbs2=-8;
        int modulo=numbs%numbs2; // 7 divided by -8 gives remainder 7
        System.out.println("The value of modulo is :"+modulo);
        System.out.println(-39%(-14)); // -39 divided by -14 gives remainder -11
        
        long z=9758091110L;
        System.out.println("The value of z is :"+z);

        System.out.println(5/2); // int/int
        System.out.println(5.0/2); // double/int
        System.out.println(5/2.0); // int/double
        System.out.println(5.0/2.0); // double/double

        // Taking input from user

        System.out.println("Enter your name :");

        Scanner sc= new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Your name is :"+name);

        int number=sc.nextInt();
        double square = Math.pow(number, 2);
        System.out.println(square);

        int numb1=5;
        System.out.println(--numb1);
        System.out.println(numb1--);
        System.out.println(numb1);

        sc.close();
        
    }
}
