package JavaDay4;

import java.io.*;
import java.util.*;

interface a{
    
    void display();
}
interface b{
    void show();
}
interface c{
    void dis();
}
class d implements a,b,c{
    int valA=10;
    int valB=20;
    public void display(){
        System.out.println(valA+valB);
        
    }
    public void show(){
        System.out.println(valA-valB);
    }
    public void dis(){
        System.out.println(valA+valB);
 
}
}
public class MultipleInheritanceInterface{
    public static void main(String[] args){
        d obj = new d();
        obj.show();
        obj.display();
        obj.dis();
    }
}
