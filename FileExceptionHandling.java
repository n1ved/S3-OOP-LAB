import java.io.*;
public class FileExceptionHandling {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            String s = "Hello World";
            for(int i = 0; i < s.length(); i++){
                fos.write(s.charAt(i));
            }
            System.out.println("File written successfully");
        }
         catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
       
        try{
            FileInputStream fis = new FileInputStream(file);
            int c;
            while((c = fis.read()) != -1){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error reading from file");
        }
        
    }
}
