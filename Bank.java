import java.util.*;

class Account{
    protected String name,accno,type;
    protected double bal;

    public void details(){
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter name: ");
        name=s.nextLine();
        System.out.println("Enter Account Number: ");
        accno=s.nextLine(); 
        System.out.println("Choose the account type:\ninput 1 for Savings Account\tinput 2 for Current Account");
        type=s.nextLine();
        bal = 0.0;
    }

    public void deposit(double am){
        bal+=am;
        System.out.println("\nDeposited="+am);
    }

    public void display(){
        System.out.println("\nName="+name);
        System.out.println("Account Number="+accno);
        System.out.println("Account Type="+type);
        System.out.println("Account Balance="+bal);
    }
}

class Savacc extends Account{
    double ci,wa;

    public void interest(){
        double r=0.05;
        ci=bal*r;
        System.out.println("\nInterest= "+ci);
        deposit(ci);
    }

    public void widraw(){
        System.out.println("\nEnter the Amount to withdraw: ");
        Scanner s=new Scanner(System.in);
        wa=s.nextDouble();
        if(bal >= wa){
            bal-=wa;
            System.out.println("Updated Balance="+bal);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

class Curacc extends Account {
    double mb=1000;
    int i=0;
    String[] cb= new String[100];
    double wa;

    public void checkbook(String c){
        if(i < cb.length){
            cb[i]=c;
            i++;
        } else {
            System.out.println("Checkbook full. Entry skipped.");
        }
    }

    public void checkbook(){
        System.out.println("\nCheckbook Entries:");
        for(int j=0; j<i; j++){
            System.out.println(cb[j]);
        }
    }

    public void checkMinBalance(){
        if(bal<mb){
            System.out.println("Balance Lower than Minimum Required Balance\n A Service Charge of Rupees 0.2% will be imposed");
            double charge = bal*0.002;
            bal -= charge;
            checkbook("Deducted Service Charge of " + charge + ", now balance is " + bal);
        }
    }

    public void widraw(){
        System.out.println("\nEnter the Amount to withdraw: ");
        Scanner s=new Scanner(System.in);
        wa=s.nextDouble();
        if(bal >= wa){
            bal-=wa;
            System.out.println("Updated Balance="+bal);
            checkbook("Withdrawal of " + wa + ", new balance is " + bal);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}


class Bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        Account a1=new Account();
        a1.details();
        String accountType = a1.type;

        if(accountType.equals("1")){
            Savacc c1=new Savacc();
            c1.name = a1.name;
            c1.accno = a1.accno;
            c1.type = a1.type;
            c1.bal = a1.bal;
            
            System.out.println("\nEnter the amount you want to deposit:");
            Double am=s.nextDouble();
            c1.deposit(am);
            
            c1.interest();
            c1.widraw();
            c1.display();
        }
        else if(accountType.equals("2")){
            Curacc c1=new Curacc();
            c1.name = a1.name;
            c1.accno = a1.accno;
            c1.type = a1.type;
            c1.bal = a1.bal;
            
            System.out.println("\nEnter the amount you want to deposit:");
            Double am=s.nextDouble();
            c1.deposit(am);
            
            c1.checkMinBalance();
            c1.widraw();
            c1.display();
            c1.checkbook();
        }
        else{
            System.out.println("Enter Valid Account Type Input");
        }
    }
}