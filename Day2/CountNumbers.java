package JavaDay2;
import java.util.Scanner;
public class CountNumbers {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int limit=s.nextInt();
	    int digit=s.nextInt();
	    int count=0;
	    for(int i=digit;i<=limit;i++){
	        if(i%digit==0){
	            count++;
	            System.out.println(count);
	        }
	    }
	    
	}
}



