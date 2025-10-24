import CIE.*;
import SEE.*;
import java.util.*;

class finalmarks{
	public static void main(String[] args) {

		Internals ind = new Internals(); 
        
		External exd = new External(); 
        
        	System.out.println("\n--- Entering Personal Details ---");
		exd.details();
        
        	System.out.println("\n--- Entering Internal Marks ---");
		ind.inmarks();	


       	 	System.out.println("\n--- Entering External Marks (SEE) ---");
        	exd.exmarks();
        


        	System.out.println("Final Marks are:-");
		int i;
		for(i=0;i<5;i++){
			System.out.println("Final marks of Subject-"+(i+1)+":-");
			System.out.println(ind.m[i]+exd.ms[i]);
		}
		
	}
}