import java.util.Scanner; 


public class QuickSort {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int sizel = scanner.nextInt();
		
		int[] arr = new int[sizel];
		
		System.out.println("Enter array :");
		for(int i=0; i<sizel ; i++){
			arr[i] = scanner.nextInt();
		}
		
		quicksort (arr , 0 , sizel-1);
		
		System.out.println("Sorted array : ");
		for(int i=0 ; i<sizel ; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
	}
	
	
	public static void quicksort(int arr[] , int l , int h){
		if(l < h){
			int pivot = partition(arr , l , h);
			quicksort(arr , l , pivot - 1);
			quicksort(arr , pivot+1 , h);
		}
	}
	
	public static int partition(int arr[] , int l , int h){
		int pivot = arr[h];
		int j = l - 1;
		
		for(int i=l ; i<h ; i++){
			if(arr[i] < pivot){
				j++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;	
			}
		}
		
		int t = arr[j+1];
		arr[j+1] = arr[h];
		arr[h] = t;
		return (j+1);
	}
}


