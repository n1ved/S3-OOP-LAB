import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = scanner.nextLine();
        System.out.print("Concatenated string : ");
        System.out.println(str1 + str2);
        scanner.close();
    }
}
