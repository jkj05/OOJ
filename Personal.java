package CIE;
import java.util.*;


public class Personal {
	String usn,name,sem;
	public void details(){
		Scanner s=new Scanner(System.in);
        System.out.println("Enter USN:");
		usn=s.nextLine();
        System.out.println("Enter Name:");
		name=s.nextLine();
        System.out.println("Enter Semester:");
		sem=s.nextLine();
		System.out.println("Name:"+name+"\nUSN:"+usn+"\nSem:"+sem);
	}
}
