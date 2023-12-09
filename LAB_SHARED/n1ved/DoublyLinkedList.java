
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
			temp.prev = head;
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
            System.out.print(temp.data + " --> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    } 
    
	public static void main(String[] args) {
			init();
			AddNodeFront(1);
			AddNodeFront(2);
			AddNodeFront(3);
			AddNodeFront(4);
			AddNodeRear(5);
			display(head);
			
			RemoveNodeFront();
			
			display(head);
			
	}
}
