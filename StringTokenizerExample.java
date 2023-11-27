
import java.util.StringTokenizer;   

public class StringTokenizerExample {

    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("Hello World");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        System.out.println();

        StringTokenizer st2 = new StringTokenizer("one,two,three" , ",");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        System.out.println();

        StringTokenizer st3 = new StringTokenizer("one,two,three" , "," , true);
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }

        System.out.println();
    }
}
