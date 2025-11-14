import java.util.*;
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age (" + age + ") cannot be negative");
        }
        this.fatherAge = age;
    }

    public int getFatherAge() {
        return fatherAge;
    }
}

class Son extends Father{
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge{
        super(fatherAge);

        if(sonAge>=this.fatherAge){
            throw new WrongAge("Son's age (" + sonAge + ") must be less than father's age (" + this.fatherAge + ").");
        }
        
        if (sonAge < 0) {
            throw new WrongAge("Son's age (" + sonAge + ") cannot be negative.");
        }

        this.sonAge=sonAge;
    }
        
    public int getSonAge(){
        return sonAge;
    }
}



public class Family {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int fatherAge = 0;
        int sonAge = 0;
        boolean validInput = false;

        System.out.println("--- Family Ages ---");

        while (!validInput) {
            try {
                System.out.print("Enter Father's Age: ");
                fatherAge = s.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number for the age.");
                s.next();
            }
        }
            

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter Son's Age: ");
                sonAge = s.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number for the age.");
                s.next(); 
            }
        }

        System.out.println("\n--- CHECKING...... ---");
        try {
            Son s1 = new Son(fatherAge, sonAge);
            System.out.println("\n Success! The family was created.");
            System.out.println("   Father's Age: " + s1.getFatherAge());
            System.out.println("   Son's Age: " + s1.getSonAge());
        } catch (WrongAge e) {
            System.out.println("\n Validation Failed. Cannot create the family.");
            System.out.println("   Error Details: " + e.getMessage());
        }
    }
}
