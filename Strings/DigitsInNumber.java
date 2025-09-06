package Strings;

public class DigitsInNumber {
    public static void main(String[] args) {
        int n=234;
        String s=""+n;

        String m=Integer.toString(n);

        System.out.println(s.length());

        System.out.println(m.length());

        int num=Integer.parseInt(m);
        System.out.println(num+1);
    }
}
