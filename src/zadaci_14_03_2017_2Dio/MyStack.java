package zadaci_14_03_2017_2Dio;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	
	private ArrayList<Object> list = new ArrayList<Object>();

	// returns true if list is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}

	// returns size of list
	public int getSize() {
		return list.size();
	}

	// shows the last object in a stack
	public Object peek() {
		return list.get(getSize() - 1);
	}

	// shows the last object in the stack and pops it out
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	// adds the object to the stack
	public void push(Object o) {
		list.add(o);
	}

	@Override // Override the protected clone method define in the Object class, and strengthen its accessibility 
	public Object clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		MyStack myStackClone = (MyStack)super.clone();
		// Deep copy list 
		myStackClone.list = copyList();
		return myStackClone;
	}

	// method that returns a copy of a list 
	private ArrayList<Object> copyList() {
		ArrayList<Object> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) 
			newList.add(list.get(i));
		return newList;
	}

	@Override  //  override toString method
	public String toString() {
		return "stack: " + list.toString();
	}
}
