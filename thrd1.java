class BMSPrinter extends Thread {
    public void run() {
        while (true) {
            System.out.println("**BMS College of Engineering**");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return; 
            }
        }
    }
}

class CSEPrinter extends Thread{
    public void run(){
        while(true){
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class thrd1{
    public static void main(String[] args) {
        BMSPrinter t1 = new BMSPrinter();
        CSEPrinter t2 = new CSEPrinter();

        t1.start();
        t2.start();
    }
}