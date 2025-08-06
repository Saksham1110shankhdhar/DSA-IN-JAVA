package Methods;

public class fActorial {

    public static void Fact(int n){
        int factorial=1;

        for(int i=1;i<=n;i++){
            factorial*=i;
        }
         System.out.print(factorial);
    }

    public static void main(String[] args) {
        int n=4;
        Fact(n);

        
    }
}
