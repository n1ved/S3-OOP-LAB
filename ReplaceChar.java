import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        char[] newStr = new char[str.length()];
        System.out.print("Enter character to be repalaced : ");
        char rc = scanner.next().charAt(0);
        System.out.print("Enter character to be replaced with : ");
        char rp = scanner.next().charAt(0);

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == rc){
                newStr[i] = rp;
            }
            else{
                newStr[i] = str.charAt(i);
            }
        }

        System.out.println(newStr);
        scanner.close();
    }
}
