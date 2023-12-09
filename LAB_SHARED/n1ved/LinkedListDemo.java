import java.util.LinkedList;
public class LinkedListDemo{
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.addLast(3);
		ll.addFirst(4);
		ll.add(2, 5);
		
		System.out.println(ll);
		
		ll.remove(2);
		ll.removeFirst(); 
		ll.removeLast();
		
		System.out.println(ll);
	}	
}
