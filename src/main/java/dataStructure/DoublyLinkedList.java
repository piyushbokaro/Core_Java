package dataStructure;

import java.util.Scanner;

public class DoublyLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
		PiyushDoublyLinkedLIst list = new PiyushDoublyLinkedLIst(); 
        System.out.println("Doubly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtLast( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos < 1 || pos > list.getSize() )
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
                    list.deleteFrom(p);
                break;     
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;            
            case 6 : 
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

class DoublyNode{
	DoublyNode next;
	DoublyNode prev;
	int value;
	public DoublyNode() {
		super();
	}
	public DoublyNode getNext() {
		return next;
	}
	public void setNext(DoublyNode next) {
		this.next = next;
	}
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

class PiyushDoublyLinkedLIst{
	int size;
	DoublyNode start;
	DoublyNode end;
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size <= 0){
			return true;
		} else {
			return false;
		}
	}
	
	public void insertAtStart(int value){
		DoublyNode newNode = new DoublyNode();
		newNode.setValue(value);
		if(start == null){
			start = newNode;
			end = start;
		} else {
			start.prev = newNode;
			newNode.next = start;
			start = newNode;
		}
		size++;
	}
	
	public void insertAtLast(int value){
		DoublyNode newNode = new DoublyNode();
		newNode.setValue(value);
		if(start == null){
			start = newNode;
			end = newNode;
		} else {
			newNode.setPrev(end);
			end.setNext(newNode);
			end = newNode ;
		}
		size++;
	}
	
	public void insertAt(int value, int position){
		if(position == 1){
			insertAtStart(value);
		}
		if(size >=0 && size >= position) {
			DoublyNode tempStartNode = start;
			for(int i = 1;i < size;i++){
				if(i == position-1){
					DoublyNode newNode = new DoublyNode();
					newNode.setValue(value);
					
					DoublyNode temp = tempStartNode.getNext();
					newNode.setNext(temp);
					temp.setPrev(newNode);
					newNode.setPrev(tempStartNode);
					tempStartNode.setNext(newNode);
					break;
				} 					
				tempStartNode = tempStartNode.getNext();
			}
		}
		size++;
	}
	
	public void deleteFrom(int position){
		if(size <= 0){
			System.out.println("No Element to Remove");
			return;
		}
		if(size > 1 && position == size){
			DoublyNode tempLastNode = end;
			DoublyNode tempBeforeLastNode = tempLastNode.getPrev();
			end = tempBeforeLastNode;
			tempBeforeLastNode.setNext(null);
			tempLastNode.setNext(null);
			tempLastNode.setPrev(null);
			size--;
			return;
		}
		if(size > 0 && size >= position){
			DoublyNode tempStartNode = start;
			for(int i = 1;i <= size;i++){
				if(i == position-1){
					DoublyNode temp = tempStartNode.getNext();
					DoublyNode tempNext = temp.getNext();
					tempStartNode.setNext(tempNext);
					tempNext.setPrev(tempStartNode);
					temp.setNext(null);
					temp.setPrev(null);
					break;
				}
				tempStartNode = tempStartNode.getNext();
			}
		}
		size--;
	}
	
	public void display(){
		if(size <= 0){
			System.out.println("Doubly Linked List is Empty");
			return;
		}
		if(start.next == null){
			System.out.println("Element in Doubly Linked List is: " + start.getValue());
			return;
		}
		
		DoublyNode temp = start;
		System.out.print("Elements in Doubly Linked List are: " + temp.getValue() + ",");
		temp = start.getNext();
		while(temp.getNext() != null){
			System.out.print(temp.getValue() + ",");
			temp = temp.getNext();
		}
		System.out.print(temp.getValue());
	}
}