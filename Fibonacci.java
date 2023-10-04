import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int n =  scanner.nextInt();
        int a=0;
        int b=1; 
        int c = 0;
        System.out.print(a+" "+b+" ");
        while(c<=n){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        System.out.println();
    }
}