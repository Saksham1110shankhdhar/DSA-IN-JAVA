public class TypeCasting {
    public static void main(String[] args) {
        char a='A';
        int value=a;// Implicit type casting from char to int
        System.out.println("The ASCII value of " + a + " is: " + value);

        char b='b';
        System.out.println((int)b);
        System.out.println(1+'1');
    }
}
