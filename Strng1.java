public class Strng1 {

    public static void main(String[] args) {
        
        //Initialisation
        String s1="Hello World";
        String s2 =new String("Java Programming");
        char[] charArray = {'S','t','r','i','n','g','s'};
        String s3=new String(charArray);

        System.out.println("---String Initialization---");
        System.out.println("s1:"+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        
        //Extraction
        char ch5=s1.charAt(4);
        String sub=s1.substring(6);
        String sub2=s1.substring(0,5);

        System.out.println("---Extraction---");
        System.out.println("Original String: "+s1);
        System.out.println("5th Character Extracted: "+ch5);
        System.out.println("Extracted Substring(from index 6):"+sub);
        System.out.println("Extracted Substring(0 to 5): "+sub2);

        //Modification
        String trmstr=s1.trim();
        String constr=s1.concat(s2);
        String upstr=s1.toUpperCase();

        System.out.println("---String Modification---");
        System.out.println("Base String: "+s1);
        System.out.println("Extra String: "+s2);
        System.out.println("Trimmed String s1: "+trmstr);
        System.out.println("Concatenated String(s1 and s2): "+constr);
        System.out.println("Uppercase String s1: "+upstr);
        
        //Comparison
        String cs1="Java";
        String cs2="java";
        String cs3="APPLE";

        System.out.println("---String Comparison---"); 	 	
        System.out.println("String A: "+cs1+"\nString B: "+cs2+"\nString C: "+cs3);
        System.out.println("1. Equals(A,B): "+cs1.equals(cs2));
        System.out.println("2. equalsIgnoreCase(A,B): "+cs1.equalsIgnoreCase(cs2));
        System.out.println("3. CompareTo(A,C): "+cs1.compareTo(cs3));
        System.out.println("4. compareTO(B,A): "+cs2.compareTo(cs1));
        	 
    }
}