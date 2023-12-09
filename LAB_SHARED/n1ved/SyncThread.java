import java.io.*;
import java.util.*;

class DemoData{
	String data = "Data";
}

class ThreadE extends Thread{
	String data;
	ThreadE(String data){
		this.data = data;
	}
	public void run(){
		synchronized (data){
			for(int i=0 ; i<5 ; i++){
				System.out.println("Executed" + this.getName());
			}
		}
	}
}

public class SyncThread{
	public static void main(String[] args) {
		
		DemoData d = new DemoData();
		
		ThreadE t1 = new ThreadE(d.data);
		ThreadE t2 = new ThreadE(d.data);
		
		
		t1.start();
		t2.start();
		
		
	}
}
