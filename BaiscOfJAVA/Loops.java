public class Loops{
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        // Better way to make even numbers
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }

        //This code is for EVEN

        for(int i=1;i<=n;i+=2){
            System.out.println(i);
        }
    }
}