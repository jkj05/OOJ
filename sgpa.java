import java.util.*;

class calsgpa{

    public void calc(){
        System.out.println("Enter the Total number of Subjects:");
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();

        s.nextLine(); 

        System.out.println("Enter The name of Subjects, Credit and Grade point respectively (e.g., Math 4 9):");
        
        String[] sub=new String[n];
        int[] cr=new int[n]; 
        int[] gp=new int[n];
        int scr = 0;
        
        double totalGradePoints = 0;

        for(int i=0;i<n;i++){
            System.out.println("\n--- Subject " + (i+1) + " ---");
            System.out.print("Enter Subject Name: ");

            sub[i]=s.nextLine(); 
            
            System.out.print("Enter Credit (cr): ");
            cr[i]=s.nextInt();

            s.nextLine(); 
            
            System.out.print("Enter Grade Point (gp): ");
            gp[i]=s.nextInt();

            s.nextLine(); 


            totalGradePoints += (cr[i] * gp[i]);
            scr+=cr[i];
        }
        

        s.close(); 
        
        System.out.println("\n--- Data Entry Completed ---");
        
        double sgpa = 0.0; 
        

        if (scr > 0) {
            sgpa = totalGradePoints / scr;
        }


        System.out.println("\n*** Semester Grade Point Average (SGPA) Calculation ***");
        System.out.println("Total (Credit * Grade Point): " + totalGradePoints);
        System.out.println("Total Credits (scr): " + scr);
        System.out.printf("Your SGPA is: %.2f\n", sgpa); 
    }
}


class sgpa{
    public static void main(String[] args) {
        calsgpa sg=new calsgpa();
        sg.calc();
    }
}