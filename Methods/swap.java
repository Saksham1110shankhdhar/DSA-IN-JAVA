package Methods;

public class swap {
    
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.print("A :"+a+"B :"+b);
    }

    public static void main(String[] args) {
        
        int x=2;
        int y=3;

        Swap(x, y);
    }
}
