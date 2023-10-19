import java.util.Scanner;

public class UpperLowerSameString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = scanner.nextLine();
        char[] newStr = new char[str.length()];
        for(int i=0 ; i<str.length() ; i++){
            if(Character.isUpperCase(str.charAt(i))){
                newStr[i] = str.toLowerCase().charAt(i);
            }
            else{
                newStr[i] = str.toUpperCase().charAt(i);
            }
        }
        System.out.println(newStr);
        scanner.close();
    }
}
