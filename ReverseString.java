import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = scanner.nextLine();
        char[] reverseS = new char[string.length()];
        int length = string.length();

        for(int i=0 ; i<length; i++){
            reverseS[i] = string.charAt(length-i-1);
        }

        System.out.println(reverseS);

        scanner.close();
    }
}
