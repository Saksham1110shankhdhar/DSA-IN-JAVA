public class factorial{
    public static void main(String[] args) {
        int number=4;
        int fact=1;
        for(int i=2;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}