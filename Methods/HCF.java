package Methods;

public class HCF {
    
    public static int hcf(int a,int b){
        int HCF=1;

        for(int i=2;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                HCF=i;
            }
        }
         return HCF;
    }

    //  Second Method

    public static int Hcf(int a,int b){
        

        for(int i=Math.min(a, b);i>2;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int a=8,b=20;
        int hCf=hcf(a,b);

        System.out.println(hCf);
        System.out.println(Hcf(a, b));
    }
}
