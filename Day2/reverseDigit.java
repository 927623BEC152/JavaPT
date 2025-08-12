package JavaDay2;
import java.util.Scanner;
public class reverseDigit 
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r;
	    int n=s.nextInt();
	    while(n!=0){
	        r=n%10;
	        n=n/10;
	        
	   
	    System.out.print(r);
	    }
	}
}


