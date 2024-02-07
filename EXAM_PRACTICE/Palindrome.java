/**
 * Write a JAVA program that reads a line of integers(susing StringTokenizer class) 
 * and write pallindrome numbers among it into 'palindrome.txt' file 
 * and read the palindrome numbers from the same file 
 * and writes sum of digits of each palindrome number along with palindrome number into the output screen.
 */
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome {
    static boolean isPalindrome(String str){
        int limit = str.length();

        for(int i=0 ; i<= limit/2 ; i++){
            if(str.charAt(i) != str.charAt(limit-i-1)){
                return false;
            }
        }
        return true;
    }

    static int countDigits(String str){
        int count = 0;
        for(int i =0 ; i<str.length() ; i++){
            count += str.charAt(i) - 48 ;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integers : ");
        String str = scanner.nextLine();

        StringTokenizer tokens = new StringTokenizer(str);        

        try{
            File file = new File("palindrome.txt");
            FileOutputStream fos = new FileOutputStream(file);

            while(tokens.hasMoreTokens()){
                String token = new String(tokens.nextToken());

                if(isPalindrome(token)){
                    for(int i=0 ; i<token.length() ; i++){
                        fos.write(token.charAt(i));
                    }
                    fos.write('\n');
                }
            }

            fos.close();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        try{
            File file = new File("palindrome.txt");
            FileInputStream fis = new FileInputStream(file);
            int c;
            StringBuilder tmpStr = new StringBuilder();
            while((c = fis.read()) != -1){
                if((char)c == '\n'){
                    int sumOfDigits = countDigits(tmpStr.toString());
                    System.out.println("Palindrome Number   = "+tmpStr+"    ,sum of digits  = "+sumOfDigits);
                    tmpStr.replace(0,tmpStr.length(), "");
                    continue;
                }
                tmpStr.append((char)c);
            }
            fis.close();
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        scanner.close();
    }    
}
