import java.util.Random;

class GeneratorThread extends Thread{
	public static int randomNum;
	int randomGen(){
		Random random = new Random();
		return random.nextInt(1000);
	}
	public void run(){
	}
}

class Cube extends Thread{
	int cubeGen(int val){
		return val*val*val ;
	}
	public void run(){}
}
class Square extends Thread{
	int squareGen(int val){
		return val*val ;
	}
	public void run(){}
}


public class MultiThread{
	public static void main(String[] args) throws Exception{
		GeneratorThread gt = new GeneratorThread();
		Cube ct = new Cube();
		Square st = new Square();
		gt.start();
		ct.start();
		st.start();
		int val;
		while(true){
			gt.sleep(1000);
			val = gt.randomGen();
			System.out.println("Generated : " + val);
			if( val % 2 != 0){
				System.out.println("Cube "+ ct.cubeGen(val));
			}else{
				System.out.println("Square "+ st.squareGen(val));
			}
		}
	}
}
