package JavaDay4;

import java.io.*;
import java.util.*;

class parent{
    int a = 10;
    int b=20;
    void display(){
       int c=a+b;
    System.out.println(c);
    }
}
class Child extends parent{
    int x=30;
    int y=40;
    void show(){
      int  z=x+y;
        System.out.println(z);
    }
}

public class SingleInheritance  {

    public static void main(String[] args) {
        Child s = new Child();
        s.display();
        System.out.println(s.y);
    
        
    }
}
