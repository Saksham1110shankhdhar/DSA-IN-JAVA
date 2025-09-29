package Oops;

class staticKey{
    static String schoolName = "ABC High School"; // Static variable

    String name;
    int age;
    String city;

    static void displaySchoolName() { // Static method
        System.out.println("School Name: " + schoolName);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        displaySchoolName(); // Calling static method from instance method
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        
        staticKey s1 =new staticKey();

        System.out.println(s1.schoolName);

         staticKey s2 =new staticKey();

         s2.schoolName="XYZ High School";

         System.out.println(s1.schoolName);




    }
}
