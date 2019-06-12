package dataStructure;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PiyushStack stack = new PiyushStack(); 
        System.out.println("Stack Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nStack Operations\n");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. check empty");
            System.out.println("4. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Push integer element");
                stack.push( scan.nextInt() );                     
                break;                          
            case 2 : 
                stack.pop();                     
                break;                         
            case 3 : 
                System.out.println("Empty status = "+ stack.isEmpty());
                break;                   
            case 4 : 
                System.out.println("Size = "+ stack.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            stack.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');   
	}
}

class StackNode {
	int value;
	StackNode ref;
	
	public StackNode() {
		super();
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public StackNode getRef() {
		return ref;
	}

	public void setRef(StackNode ref) {
		this.ref = ref;
	}
}

class PiyushStack{
	StackNode top;
	StackNode bottom;
	int size;
	
	public PiyushStack() {
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
	
	public void push(int value){
		StackNode newNode = new StackNode();
		newNode.setValue(value);
		if(top == null){
			bottom = newNode;
			top = newNode;
		} else {
			newNode.setRef(top);
			top = newNode;
		}
		size++;
	}
	
	public void pop(){
		if(top == null){
			System.out.println("No Element to Pop");
		} else {
			System.out.println("Element Popped Out is: " + top.getValue());
			StackNode temp = top.getRef();
			top = temp;
			temp = null;
		}
		size--;
	}
	
	public void display(){
		if(size <= 0){
			System.out.println("No Element to Display");
			return;
		}
		
		if(top.getRef() == null){
			System.out.println("Element available is: " + top.getValue());
			return;
		}
		
		System.out.print("Element available is: ");
		System.out.print(top.getValue() + ",");
		StackNode tempTop = top.getRef();
		while(tempTop.getRef() != null){
			System.out.print(tempTop.getValue() + ",");
			tempTop = tempTop.getRef();
		}
		System.out.print(tempTop.getValue()+ "\n");
	}
}