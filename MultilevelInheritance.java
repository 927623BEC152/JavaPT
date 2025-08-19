package JavaDay4;

import java.io.*;
import java.util.*;

class A{
    int a = 10;
    int b=20;
    void display(){
       int c=a+b;
    System.out.println(c);
    }
}
class B extends A{
    int i=9;
    int B=0;
    int h=i+B;
    void ut(){
    System.out.println(h);
    }
}
class C  extends B{
    int x=30;
    int y=40;
    void show(){
      int  z=x+y;
        System.out.println(z);
    }
}
class D extends C{
    String name ="Nice";
    int salary=8000;
    void you(){
        System.out.println(salary);
    }
}
class E extends D{
    String name="me";
    int amount=9000;
    void me(){
        System.out.println(name+" "+salary);
    }
}
public class MultilevelInheritance  {

    public static void main(String[] args) {
        E s = new E();
        s.display();
        s.show();
        s.me();
        s.ut();
        System.out.println(s.amount);
    
        
    }
}
