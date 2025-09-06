package Strings;

import java.util.Scanner;

public class BasicOfString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="Saksham";

        char ch=sc.next().charAt(0);

        String input=sc.nextLine();

       

        System.out.println("Your name is "+name);

        System.out.println(name.length());
        System.out.println(name.indexOf('m'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("Sak"));
        System.out.println(name.endsWith("am"));
        System.out.println(name.contains("sak"));




        System.out.println(name.charAt(6));

        for(int i=0;i<input.length();i++){
            System.out.print(input.charAt(i)+" ");
        }

        // The correct method to close the Scanner is 'sc.close();' (with a lowercase 'c').
        // Java is case-sensitive, so 'sc.Close();' will cause a compilation error.
        // You should replace 'sc.Close();' with 'sc.close();' below.

        sc.close();

    }

    
}