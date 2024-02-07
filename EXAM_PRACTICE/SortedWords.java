import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

/**
 * Write a JAVA program that reads a line of words (using StringTokenizer class) 
 * and sort the words and write the sorted words into 'sortedwords.txt'
 * and write number of words in 'sortedwords.txt' file into output window.  
 * Read the filename 'sortedwords.txt' as command line arguments.
 */

public class SortedWords{
    static StringBuilder sort(String[] strArr , int size){
        StringBuilder str = new StringBuilder();
        StringBuilder[] strBuildArray = new StringBuilder[size];
        for(int i=0 ; i<size ; i++){
            strBuildArray[i] = new StringBuilder(strArr[i]);
        }
        for(int i=0 ; i<size ; i++){
            for(int j=i ; j<size ; j++){
                if(strBuildArray[j].toString().compareToIgnoreCase(strBuildArray[i].toString()) < 0){
                    StringBuilder temp = new StringBuilder(strBuildArray[j].toString());
                    strBuildArray[j] = strBuildArray[i];
                    strBuildArray[i] = temp;
                }
            }
            str.append(strBuildArray[i]);
            str.append('\n');
        }
        return str;
    }
    public static void main(String args[]){
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<args.length ; i++){
            str.append(args[i] +" ");
        }

        StringTokenizer tokens = new StringTokenizer(str.toString());
        File file = new File("sortedwords.txt");

        try{
            FileOutputStream fos = new FileOutputStream(file);
            int fileCount = tokens.countTokens();
            String[] strArr = new String[fileCount];
            int i=0;
            while(tokens.hasMoreTokens()){
                strArr[i] = new String(tokens.nextToken());
                i++;
            }
            StringBuilder sortedStr = sort(strArr, fileCount);

            for(int j=0 ; j<sortedStr.length() ; j++){
                fos.write(sortedStr.charAt(j));
            }

            fos.close();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        try{
            FileInputStream fis = new FileInputStream(file);
            int c;
            int count = 0;
            while((c = fis.read()) != -1 ){
                if((char)c == '\n'){
                    count++;
                }
            }
            System.out.println("Number of words in sorted file : "+count);
            fis.close();
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}