package JavaDay4;

import java.util.*;

class SuperA{
    int a=1;
    int b=4;
    int c=10;
    void display(){
        System.out.println(a+b+c);
    }
    SuperA(){
        int t=90;
        
        System.out.println("MKCE");
    }
}
class SuperB extends SuperA{
    SuperB(){
       super();
        super.display();
        System.out.println(super.a);
        System.out.println(super.c);
        System.out.println("Name");
        
    }
}
public class SuperKeyExample{
    public static void main(String[] args){
        SuperB obj =new SuperB();
       
    }
}
