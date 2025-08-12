package JavaDay1;
import java.util.*; 

public class character {
    

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    char initial=s.next().charAt(0);
        s.nextLine();
	    String name=s.nextLine();
	    int age=s.nextInt();
	    float percent=s.nextFloat();
	    System.out.println("Name:"+initial+" "+ name+"\nAGE:"+age+ "\npercentage:"+percent);

	}
}


