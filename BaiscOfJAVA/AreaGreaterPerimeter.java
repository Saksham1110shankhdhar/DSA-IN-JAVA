import java.util.Scanner;

public class AreaGreaterPerimeter{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Length of Rectangle :");

         double len=sc.nextDouble();
         System.out.println("Your given lenth is : "+len);

         System.out.println("Enter the Length of Rectangle :");

         double breadth=sc.nextDouble();

         System.out.println("Your Given breadth is :"+breadth);

         double area=len*breadth;

         double perimeter=2*(len+breadth);

         if(area>perimeter){
            System.out.println("Congratulation , Area greater than its perimeter");
         }else{
            System.out.println("Area lesser than Perimeter");
         }

         sc.close();
        
    }
}