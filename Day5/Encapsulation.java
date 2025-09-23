package JavaDay5;

class EncapsulationExample {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setName("jhg");
        obj.setAge(66);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
