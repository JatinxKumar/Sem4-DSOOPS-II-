class Animal {
    void sound() {
        System.out.println("Sound");
    }
}
class Dog extends Animal{ // Always use inheritance while overriding

    @Override void sound() {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal{

    void sound() {
        System.out.println("Cat sound");
    }
}
public class MethodOverridingExample{

    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.sound();

        Animal a = new Cat();
        a.sound();
    }
}