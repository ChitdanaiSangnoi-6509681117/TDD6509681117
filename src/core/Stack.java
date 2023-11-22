package core;
import java.util.*;

public class Stack implements IStack {
	int size, maxSize, topPos;
	Object top;
	private ArrayList<Object> stack;
	    
	    
	public Stack() {
		this.top = null;
		size = 0;
		stack = new ArrayList<>();
		topPos = 0;
	}
	
	@Override
	public boolean push(Object elm){
		if(isFull()) {
			return false;
		}
		if(isEmpty()||elm.getClass().equals(top.getClass())) {
			stack.add(elm);
			top = elm;
			size++;
			topPos++;
			return true;
		}
		return false;
	}
	
	@Override
	public Object pop() {
		if(!isEmpty()) {
			Object tmp = top;
	        top = (topPos > 0) ? stack.get(topPos - 1) : null;
	        stack.remove(topPos - 1);
	        size--;
	        topPos = (topPos > 0) ? topPos - 1 : 0;
	        return tmp;
		}
		else {
			System.out.println("ERROR: Nothing to pop, empty stack.");
		}
		return 0;
	}

	@Override
	public void setCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		maxSize = initialCapacity;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return (size==maxSize)?true:false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size==0)?true:false;
	}

}
