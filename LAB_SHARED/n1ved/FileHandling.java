import java.util.Scanner;
import java.io.*;

public class FileHandling{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter filename : ");
		String fileName = scanner.nextLine();
		
		File file = new File(fileName);
		
		System.out.print("Enter string to write : ");
		String toWrite = scanner.nextLine();
		
		try{
			FileWriter fw = new FileWriter(file);
			for(int i=0 ; i<toWrite.length() ; i++){
				fw.write(toWrite.charAt(i));
			}
			System.out.println("File Wrote");
			fw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error : could not find file");
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println("Error : could not write file");
			System.out.println(e);
		}
		
		System.out.println("Reading file ...");
		
		try{
			FileReader fr = new FileReader(file);
			int c;
			while((c = fr.read())!=-1){
				System.out.print((char)c);
			}
			System.out.println();
			fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error : could not find file");
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println("Error : could not read file");
			System.out.println(e);
		}
		
		
		
	}	
}
