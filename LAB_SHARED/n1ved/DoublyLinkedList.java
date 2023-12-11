import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node prev;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList{
	static Node head;
	static Node tail;
	
	public static void init(){
		head = null;
		tail = null;
	}
	
	public static void AddNodeFront(int data){
		Node temp = new Node(data);
		if(head  == null){
			head = temp;
			tail = temp;
		}
		else{
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	public static void AddNodeRear(int data){
		Node temp = new Node(data);
		if(tail  == null){
			head = temp;
			tail = temp;
		}
		else{
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
	}
	
	public static void RemoveNodeFront(){
		if (head == null) { 
		    return; 
		} 
	  
		if (head == tail) { 
		    head = null; 
		    tail = null; 
		    return; 
		} 
	  
		Node temp = head; 
		head = head.next; 
		head.prev = null; 
		temp.next = null; 
	}
	
	public static void RemoveNodeRear(){
		 if (tail == null) { 
			return; 
		} 

		if (head == tail) { 
			head = null; 
			tail = null; 
			return; 
		} 

		Node temp = tail; 
		tail = tail.prev; 
		tail.next = null; 
		temp.prev = null; 
	}
	static void display(Node head) 
    { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		init();
		int o;
		System.out.println("1. Add Node Front");
		System.out.println("2. Add Node Rear");
		System.out.println("3. Remove Node Front");
		System.out.println("4. Remove Node Rear");
		System.out.println("5. Display");
		System.out.println("6. Exit");
		while(true){
			System.out.print("Enter your choice : ");
			o = scanner.nextInt();
			switch(o){
				case 1:
					System.out.print("Enter data : ");
					int data = scanner.nextInt();
					AddNodeFront(data);
					break;
				case 2:
					System.out.print("Enter data : ");
					data = scanner.nextInt();
					AddNodeRear(data);
					break;
				case 3:
					RemoveNodeFront();
					break;
				case 4:
					RemoveNodeRear();
					break;
				case 5:
					display(head);
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
			
	}
}
