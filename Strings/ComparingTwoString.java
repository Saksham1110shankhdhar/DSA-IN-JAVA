package Strings;

public class ComparingTwoString {
    public static void main(String[] args) {
        String s="Saksham";
        String m="Saksham";

        String v=new String("Saksham");

        System.out.println(s==v);
        System.out.println(s==m);
        System.out.println(s.equals(v));
    }
}
