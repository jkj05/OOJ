import java.util.*;

class quadEq{
   double d,qe1,qe2;
	int a,b,c;

    public void calc(){
        Scanner s=new Scanner(System.in);
	System.out.println("Enter the a,b and c coefficients of the Quadratic Equation");
        a=s.nextInt();
        b=s.nextInt();
	c=s.nextInt();
	System.out.println("Quadratic Equation: "+a+"x+"+b+"y+"+c+"z=0");
	d=(b*b)-(4*a*c);
	qe1=((-b)+d)/(2*a);
	qe2=((-b)-d)/(2*a);
	
    }

    public void print(){
	if(d<0)
        System.out.println("The Roots are Imaginary");
	
	if(d==0)
	System.out.println("The Roots are Real and Equal");    

	if(d>0)
	System.out.println("The Roots are Real and Distinct");

	System.out.println("The Roots are: "+qe1+", "+qe2);
}
    
}

class calquadeq {
    public static void main(String[] args){
    quadEq n=new quadEq();
    n.calc();
    n.print();
    
    }

}
