import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number which you want to check Positivity :");

        int num=sc.nextInt();

        if(num>0){
            System.out.println(num);
        }else{
            System.out.println(-(num));
        }

        sc.close();
    }
}
