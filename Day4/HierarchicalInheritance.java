package JavaDay4;

import java.io.*;
import java.util.*;

class parentH{
    int a = 10;
    int b=20;
    void display(){
       int c=a+b;
    System.out.println(c);
    }
}
class Child1 extends parentH{
    int x=30;
    int y=40;
    void show(){
      int  z=x+y;
        System.out.println(z);
    }
}

class Child2 extends parentH{
    String name="nice";
    int i=800;
    void you(){
     
        System.out.println(name);
    }
}
class Child3 extends parentH{
    int A=100;
    int B=200;
    int C=A+B;
    void me(){
    
        System.out.println(C);
    }
}
public class HierarchicalInheritance  {

    public static void main(String[] args) {
        Child1 s1 = new Child1();        
        Child2 s2 = new Child2();

        Child3 s3 = new Child3();

        s3.display();
        s1.display();
        s2.display();
        s2.you();
        s3.me();
        
    
        
    }
}
