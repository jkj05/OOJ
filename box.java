import java.util.*;

class book{
    public String name;
    public String author;
    public int price;
    public int pages;

    public void set(){
        System.out.println("Enter name,author,price and pages of the book");
        Scanner s=new Scanner(System.in);
        name =s.nextLine();
        author =s.nextLine();
        price = s.nextInt();
        pages = s.nextInt();
    }

    public void get(){
        System.out.println("Name="+name);
        System.out.println("Author="+author);
        System.out.println("Price="+price);
        System.out.println("Pages="+pages);

   }
}



public class box {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Books");
        int num=s.nextInt();
        book a[]=new book[5];

        for(int i=0;i<num;i++)
        {
            a[i]=new book();
            a[i].set();
            a[i].get();

        }
    }
}
