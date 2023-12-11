import javax.xml.crypto.Data;

class DemoData {
    int data = 0;
    synchronized void increment() {
        data++;
    }
}

class ThreadE extends Thread {
    DemoData data;
    ThreadE(DemoData data) {
        this.data = data;
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            data.increment();
            System.out.println("Executed " + this.getName() + " " + data.data);
        }
    }
}

public class SyncThreadDemo {
    public static void main(String[] args) {
        DemoData d = new DemoData();
        ThreadE t1 = new ThreadE(d);
        ThreadE t2 = new ThreadE(d);
        t1.start();
        t2.start();
    }
}