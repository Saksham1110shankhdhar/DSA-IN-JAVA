import java.util.Scanner;
public class ProfitandLoss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Cost Price : ");
        double costPrice=sc.nextDouble();

        System.out.println("Enter Selling Price : ");
        double SellingPrice=sc.nextDouble();

        System.out.println("Your C.P IS :"+costPrice);
        System.out.println("Your C.P IS :"+SellingPrice);

        double clac;

        if(costPrice>SellingPrice){
            clac=costPrice-SellingPrice;
            System.out.println("The Merchant made Loss is :" +clac);
        }else if(costPrice==SellingPrice){
            System.out.println("No Profit , No Loss");
        }else{
            clac=SellingPrice-costPrice;
            System.out.println("The Merchant made profit is :"+clac);
        }
         sc.close();
    }
}
