class Task2 implements Runnable {
    long time;
    Thread t;

    Task2(long time) {
        this.time = time;
        t = new Thread(this, "t2");
    }

    public void run() {
        System.out.println(t.getName() + " start");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {}
        System.out.println(t.getName() + " end");
    }
}

class Task1 implements Runnable {
    long time;
    Task2 task2;
    Thread t;

    Task1(long time, Task2 task2) {
        this.time = time;
        this.task2 = task2;
        t = new Thread(this, "t1");
        t.start();
    }

    public void run() {
        System.out.println(t.getName() + " start");
        task2.t.start();
        try {
            Thread.sleep(time);
            task2.t.join();
        } catch (InterruptedException e) {}
        System.out.println(t.getName() + " end");
    }
}

public class T {
    public static void main(String[] args) {
        Task2 t2 = new Task2(500);
        Task1 t1 = new Task1(50, t2);
         
        try {
            t1.t.join();
        } catch (InterruptedException e) {}
    }
}
