package SEE;
import CIE.*;
import java.util.*;


public class External extends Personal {
	public int ms[] = new int[5];
    
	public void exmarks(){
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("Enter the SEE marks of 5 subjects:-");
		for(i=0; i<5; i++){
            System.out.print("SEE Mark for Subject " + (i+1) + ": ");
			ms[i] = s.nextInt();
		}
	}
}