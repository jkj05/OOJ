package CIE;
import java.util.*;

public class Internals{

	public int m[] = new int[5]; 
    
	public void inmarks(){
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("Enter the Internal marks of 5 subjects:-");
		for(i=0; i<5; i++){
            		System.out.print("Mark for Subject " + (i+1) + ": ");
			m[i] = s.nextInt();
		}
	}
}
