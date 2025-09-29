package Oops;

class thiss{
    String name;
    int age;
    String city;

    thiss(String name, int age, String city) {
        this.name = name; // Using 'this' to refer to instance variables
        this.age = age;
        this.city = city;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("City: " + this.city);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        thiss key = new thiss("Aman", 20, "Delhi");
        key.print();
    }
}
