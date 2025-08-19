package JavaDay5;

interface New {
    int x = 5;
    int y = 6;
    void me();
}

abstract class A {
    int a = 1, b = 3;
    abstract void display();

    void show() {
        System.out.println(a + b);
    }
}

class B extends A implements New {
    void display() {
        System.out.println(a + b);
    }

    public void me() {
        System.out.println(x + y);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
        obj.me();
    }
}
