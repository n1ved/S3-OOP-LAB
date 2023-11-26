import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingWithExceptionHandling {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Ask user for file to be opened/Created
        System.out.print("Enter file name : ");
        String filename = scanner.nextLine();

        //Create file object
        File file = new File(filename);

        try{
            if(file.createNewFile()){
                System.out.println("File created at "+file.getAbsolutePath());
            }
            else{
                System.out.println("File alread exists . opened file");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }


        //Write to file
        try{
            FileOutputStream fos = new FileOutputStream(file);

            //Get input of string to be written
            System.out.print("Enter string to write into file : ");
            String str = scanner.nextLine();

            //Write to file one by one characters
            for(int i=0 ; i<str.length() ; i++){
                fos.write(str.charAt(i));
            }

            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }


        //Read from file
        try{
            FileInputStream fis = new FileInputStream(file);

            //Print content as one by one letters
            while(true){
                int c = fis.read();
                if (c == -1) {
                    break;
                }
                System.out.print((char)c);
            }
            System.out.println();
            fis.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

        
    }
}
