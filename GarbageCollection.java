import java.util.Scanner;

class GarbageCollection {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long mem1, mem2 , mem3;
        System.out.println("Total memory is: " + rt.totalMemory());
        mem1 = rt.freeMemory();
        System.out.println("Initial free memory: " + mem1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = i;
        }
        mem2 = rt.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        rt.gc();
        mem3 = rt.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem3);        
    }    
}
