/*
 * Write a method that returns the nth prime number of a list. 
 * If the index of the element exceeds the list size, then return -1 using collections.
 */

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionPrime {
    static int counter = 0;
    static ArrayList<Integer> al = new ArrayList<Integer>(); 
    static int getPrime(int n){
        ListIterator<Integer> itr = al.listIterator();
        while(itr.hasNext()){
            int cur = itr.next();
            System.out.println(cur + " "+counter);
            boolean isPrime = true;
            for(int i=2 ; i<=n/2 ; i++){
                if(cur % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                counter++;
                if(counter == n)
                    return cur;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of list : ");
        int n = scanner.nextInt();
        System.out.print("Enter List : ");
        for(int i=0 ; i<n ; i++){
            al.add(scanner.nextInt());
        }
        System.out.print("Enter possition of prime number to print : ");
        int key = scanner.nextInt();
        System.out.println("Found at "+getPrime(key));
        scanner.close();
    }
}
