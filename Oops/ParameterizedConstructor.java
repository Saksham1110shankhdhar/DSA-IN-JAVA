package Oops;

class Studentss {
    String name;
    int age;
    String city;

    Studentss(String n, int a, String c) {
        name = n;
        age = a;
        city = c;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Studentss s1 = new Studentss("Aman", 20, "Delhi");
        s1.print();
    }
}


