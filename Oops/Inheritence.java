package Oops;

class Animal{
    int legs;
    String color;
    String sound;

}

class Dog extends Animal{
    Boolean Loyalty;
}

public class Inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.legs=4;
        d.color="Brown";
        d.sound="Bark";
        d.Loyalty=true;
        System.out.println(d.legs+" "+d.color+" "+d.sound+" "+d.Loyalty);
    }
}
