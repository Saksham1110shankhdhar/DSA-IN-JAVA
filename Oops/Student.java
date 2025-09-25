package Oops;

 class Student{
    String name;
    int age;
    String city;

    Student(String n, int a, String c) {
        name=n;
        age=a;
        city=c;
    }

    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
