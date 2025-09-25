package Oops;

class Student {
    String name;
    int age;
    String city;
    private long rollNo;

    long getRollNo() {
        return rollNo;
    }

    void setRollNo(long newRollNo) {
        rollNo = newRollNo;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

public class PrivateKeybWordjava {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 20;
        s1.city = "Delhi";

        // setting roll number via setter
        s1.setRollNo(123456);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll No: " + s1.getRollNo());

        s1.study();
    }
}
