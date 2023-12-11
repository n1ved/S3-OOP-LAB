

public class ExceptionHandlingDemo{

    static void divide(int x , int y) throws ArithmeticException{
        int c;
        try{
            c = x/y;
            if(c == 0){
                throw new ArithmeticException("Result is zero");
            }
            System.out.println("Result is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Error : "+e.getMessage());
        }
        finally{
            System.out.println("finally block executed");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        divide(1,0);
        divide(0, 2);
        divide(10, 2);
    }
}
