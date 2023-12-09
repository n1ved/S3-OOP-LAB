import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizedSum{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Integers seperated by space : ");
		String inputInt = scanner.nextLine();
		
		StringTokenizer tokenizedInt = new StringTokenizer(inputInt);
		
		int sum = 0;
		
		while(tokenizedInt.hasMoreTokens()){
			sum += Integer.parseInt(tokenizedInt.nextToken());
		}
		System.out.println("Sum is "+sum);
	}
}
