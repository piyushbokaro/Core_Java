package dataStructure;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PiyushQueue queue = new PiyushQueue(); 
        System.out.println("Stack Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nQueue Operations\n");
            System.out.println("1. To EnQueue the Element");
            System.out.println("2. To Dequeue the Element");
            System.out.println("3. check empty");
            System.out.println("4. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Push integer element");
                queue.enqueue( scan.nextInt() );                     
                break;                          
            case 2 : 
            	queue.dequeue();                     
                break;                         
            case 3 : 
                System.out.println("Empty status = "+ queue.isEmpty());
                break;                   
            case 4 : 
                System.out.println("Size = "+ queue.getLength() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            queue.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 
	}
}

class QueueNode{
	QueueNode ref;
	int value;
	
	public QueueNode() {
		super();
	}

	public QueueNode getRef() {
		return ref;
	}

	public void setRef(QueueNode ref) {
		this.ref = ref;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class PiyushQueue{
	QueueNode first;
	QueueNode last;
	int length;
	
	public boolean isEmpty(){
		if(length == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getLength(){
		return length;
	}
	
	public void enqueue(int value){
		QueueNode newNode = new QueueNode();
		newNode.setValue(value);
		if(first == null){
			first = newNode;
			last = newNode;
		} else {
			newNode.setRef(last);
			last = newNode;
		}
		length++;
	}
	
	//Has to be implemented
	public void dequeue(){
		/*if(first == null) {
			System.out.println("No Elements to Dequeue");
		} else {
			QueueNode tempNode = first;
			System.out.println("Element Dequeued is: " + tempNode.getValue());
			first = first.getRef();
			tempNode = null;
		}*/
	}
	
	public void display(){
		if(length <= 0){
			System.out.println("No Element to Display");
			return;
		}
		
		if(last.getRef() == null){
			System.out.println("Element available is: " + last.getValue());
			return;
		}
		
		System.out.print("Element available is: ");
		System.out.print(last.getValue() + ",");
		QueueNode tempLast = last.getRef();
		while(tempLast.getRef() != null){
			System.out.print(tempLast.getValue() + ",");
			tempLast = tempLast.getRef();
		}
		System.out.print(tempLast.getValue()+ "\n");
	}
}