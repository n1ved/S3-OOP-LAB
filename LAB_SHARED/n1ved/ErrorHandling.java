public class ErrorHandling{
	public static void divide(int x, int y){
		try{
			int c = x/y;
		}
		catch(ArithmeticException e){
			System.out.println("Error occured : "+e);
		}
		finally{
			System.out.println("Finally excecuted");
		}
	}
	public static void throwARandomErrorMessage(){
		try{
			throw new Exception("A random error message is thrown");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		divide(1 , 0);
		throwARandomErrorMessage();
	}
}
