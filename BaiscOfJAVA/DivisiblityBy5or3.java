import java.util.Scanner;
public class DivisiblityBy5or3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter A Number by which check number divisible by 5 or 3");

        int number=sc.nextInt();

        if(number%5==0 || number%3==0){
            System.out.println("Congratulation the number is  divisible");
        }else{
            System.out.println("Not Divisible... ");
        }
        sc.close();
    }
}
