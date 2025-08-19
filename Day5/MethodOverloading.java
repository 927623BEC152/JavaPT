package JavaDay5;

class MethodOverloadingExample {
    int mymethod(int x) {
        return x + 5;
    }

    float mymethod(float x) {
        return x + 5;
    }

    double mymethod(double x, double y) {
        return x + y;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        System.out.println(obj.mymethod(10));
        System.out.println(obj.mymethod(10.5f));
        System.out.println(obj.mymethod(10.55, 11.8));
    }
}
