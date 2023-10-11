import java.util.Scanner;

public class RepeatedLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        System.out.print("Enter a character : ");
        char c = scanner.next().charAt(0);
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(c+" is repeated "+count+" times");
        scanner.close();
    }
}
