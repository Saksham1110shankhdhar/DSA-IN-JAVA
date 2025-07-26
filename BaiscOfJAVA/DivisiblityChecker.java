import java.util.Scanner;
public class DivisiblityChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Number which can check divisiblity by 5 :");

        int num=sc.nextInt();

        if( num % 5==0){
            System.out.println("The number " +num+ " Divible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }
        sc.close();
    }
}
