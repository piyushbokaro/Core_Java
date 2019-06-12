package dataStructure;

import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PiyushLinkedList list = new PiyushLinkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. Reverse the List");
            System.out.println("6. check empty");
            System.out.println("7. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAt(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.removeAt(p);
                break;
            case 6 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;                   
            case 7 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}

class Node {
	int value;
	Node ref;
	
	public Node() {
		super();
		this.value = 0;
		this.ref = null;
	}
	
	public Node(int value, Node ref) {
		super();
		this.value = value;
		this.ref = ref;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getRef() {
		return ref;
	}
	public void setRef(Node ref) {
		this.ref = ref;
	}
}

class PiyushLinkedList {
	Node head;
	Node tail;
	int size;
	
	public PiyushLinkedList() {
		super();
	}
	
	public boolean isEmpty(){
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtStart(int value){
		Node newNode = new Node();
		newNode.setValue(value);
		size++;
		if(head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.setRef(head);
			head = newNode;
		}
	}
	
	public void insert(int value){
		Node newNode = new Node();
		newNode.setValue(value);
		size++;
		if(head == null) {
			head = newNode;
			tail = head;
		} else {
			tail.setRef(newNode);
			tail = newNode;
		}
	}
	
	public void insertAtEnd(int value){
		insert(value);
	}
	
	public void insertAt(int value, int position){
		Node tempHead = head;
		if(position <= size){
			for(int i = 1;i < size;i++){
				if(i == position-1){
					Node newNode = new Node();
					newNode.setValue(value);
					
					Node temp = tempHead.getRef();
					newNode.setRef(temp.getRef());
					tempHead.setRef(newNode);
					break;
				}
				tempHead = tempHead.getRef();
			}
			size++;
		} else {
			System.out.println("Position index out of Range");
		}
	}
	
	public void removeAt(int position){
		if(size > 0 && size >= position){
			Node headNode = head;
			for(int i = 1;i < size;i++){
				if(i == position-1) {
					Node tempNode = headNode.getRef();
					headNode.setRef(tempNode.getRef());
					tempNode = null;
					break;
				} 
			}
			size--;
		} else {
			System.out.println("Position index out of Range");
		}
	}
	
	public void display() {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }    
        if (head.getRef() == null) {
            System.out.println(head.getValue() );
            return;
        }
        Node ptr = head;
        System.out.print(head.getValue()+ "->");
        ptr = head.getRef();
        while (ptr.getRef() != null) {
            System.out.print(ptr.getValue()+ "->");
            ptr = ptr.getRef();
        }
        System.out.print(ptr.getValue()+ "\n");
    }
}