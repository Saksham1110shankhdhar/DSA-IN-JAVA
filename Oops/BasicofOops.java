package Oops;

 class Student{
    String name;
    int age;
    String city;
    long rollNo;

    void study(){
        System.out.println(name + " is studying.");
    }
}

public class BasicofOops{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 20;
        s1.city = "Delhi";
        s1.rollNo = 123456;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        s1.study();
    }
}
