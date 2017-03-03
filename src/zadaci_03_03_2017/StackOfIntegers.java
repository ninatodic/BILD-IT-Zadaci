package zadaci_03_03_2017;

public class StackOfIntegers {
	// data fields
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	// default constructor and constructor with parameters
	public StackOfIntegers(){
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers (int capacity){
		elements = new int[capacity];
	}
	
	// method that pushes values in stack and doubles the capacity of the array if necessary 
	public void push (int value){
		if (size>= elements.length){
			int[] temp = new int [elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		elements[size++]=value;
	}
	
	// method that returns top element and deletes it from the stack
	public int pop(){
		return elements[--size];
	}
	
	// method that returns top element without deleting it
	public int peek(){
		return elements[size-1];
	}
	
	// method that returns true if stack is empty
	public boolean empty(){
		return size == 0;
	}
	
	// method that returns size of the stack
	public int getSize (){
		return size;
	}
	
}
