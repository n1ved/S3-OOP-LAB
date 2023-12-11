import java.util.Scanner;

public class BinarySearch{
    static int binarySearch(int arr[] , int l , int h , int search){
        while (l <= h) { 
            int mid = l + (h - l) / 2; 
            if (arr[mid] == search) 
                return mid; 
            if (arr[mid] < search) 
                l = mid + 1; 
            else
                h = mid - 1; 
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int sizel = scanner.nextInt();
        
        int[] arr = new int[sizel];
        
        System.out.println("Enter array :");
        for(int i=0; i<sizel ; i++){
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter element to search :");
        int search = scanner.nextInt();
        
        int index = binarySearch(arr , 0 , sizel-1 , search);
        
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }
}