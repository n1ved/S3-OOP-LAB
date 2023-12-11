import java.io.*;
public class FileReaderWriter3A {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("example.txt");
        FileWriter fw = new FileWriter("example2.txt");
        int c;
        while((c = fr.read()) != -1){
            System.out.print((char)c);
            fw.write(c);
        }
        System.out.println();
        fr.close();
        fw.close();
    }
}
