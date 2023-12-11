import java.util.Scanner;

public class QuickSort {
    static int partition(String[] arr , int l , int h){
        String pivot = arr[h];
        int i = l-1;
        for(int j=l ; j<h ; j++){
            if(arr[j].compareTo(pivot) < 0){
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
    static void quickSort(String[] arr , int l , int h){
        if(l < h){
            int pi = partition(arr , l , h);
            quickSort(arr , l , pi-1);
            quickSort(arr , pi+1 , h);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int sizel = scanner.nextInt();
        System.out.println("Enter names :");
        scanner.nextLine();
        String[] arr = new String[sizel];
        for(int i=0; i<sizel ; i++){
            arr[i] = scanner.nextLine();
        }
        quickSort(arr , 0 , sizel-1);
        System.out.println("Sorted array :");
        for(int i=0; i<sizel ; i++){
            System.out.println(arr[i]);
        }
    }
}
