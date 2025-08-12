package JavaDay2;
import java.util.Scanner;
public class PasswordVerification
{
	public static void main(String[] args) {
	    Scanner s= new Scanner (System.in);
	    int i=0;
	    int pass=5665;
	    int newpass;
	    
	   do{
	        System.out.println("Enter pass:");
	        newpass=s.nextInt();
	   }
	   while(newpass!=pass);

	  
	        System.out.println("Password is correct");
	    
}
	}

    
