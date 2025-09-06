package Strings;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Saksham");
       
        s.append("Muskan");

        //System.out.print(s);

        s.reverse();
        System.out.print(s);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :");

        StringBuilder m= new StringBuilder(sc.nextLine());

        System.out.print(m);

    }
}
