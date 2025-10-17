import java.util.*;

abstract class shape {
    int b, h;
    abstract public void printArea();
}

class rectangle extends shape {

    public void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length and Breadth of the rectangle");
        b = s.nextInt();
        h = s.nextInt();
        double area = b * h;
        System.out.println("Area of Rectangle is: " + area);
    }
}

class triangle extends shape {

    public void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Base and height of the Triangle ");
        b = s.nextInt();
        h = s.nextInt();
        double area = 0.5 * b * h;
        System.out.println("Area of Triangle is: " + area);
    }
}

class circle extends shape {
    public void printArea() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius of the Circle");
        int b = s.nextInt(); 
        double area = 3.14 * b * b;
        System.out.println("Area of Circle is: " + area);
    }
}

class polygons {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        triangle t1 = new triangle();
        circle c1 = new circle();
        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}