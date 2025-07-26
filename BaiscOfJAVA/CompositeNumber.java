import java.util.Scanner;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        boolean flag=false;// indicate the value is Prime number

        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                flag=true;
            }
        }
        if(num==1){
            System.out.println("Neither Prime nor Composite");
        }
        else if(flag==true){
            System.out.print("The Number is Composite :"+num);
        }else{
            System.out.print("The number is prime");
        }
        

        //Another Way to print the Composite Number

        System.out.println(" ");
        System.out.println(" ");

        for(int i=2;i<num-1;i++){
            if(num%i==0){
                System.out.print("The Number is Composite :"+num);
                break;
            }
        }

        sc.close();
        
    }
}
