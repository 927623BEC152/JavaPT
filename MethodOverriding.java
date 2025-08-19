package JavaDay5;

class Animal {
    void sound() {
        System.out.println("I'm an animal");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("I'm a bird");
    }
}

class Tom extends Animal {
    @Override
    void sound() {
        System.out.println("I'm Tom");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj = new Bird();
        obj.sound();
        Animal obj1 = new Tom();
        obj1.sound();
    }
}
