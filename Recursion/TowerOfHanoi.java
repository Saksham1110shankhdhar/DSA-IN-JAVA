package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','C','B');
    }

    private static void hanoi(int n, char A, char C, char B) {
        if(n==0){
            return;
        }
        hanoi(n-1, A, B, C);
        System.out.println(A+"->"+C);
        hanoi(n-1, B, C, A);
    }
}
