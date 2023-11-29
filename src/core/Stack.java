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
		topPos = -1;
		maxSize = 10;
	}
	
	@Override
	public boolean push(Object elm){
		if(isFull()) {
			System.out.println("Full");
			return false;
		}
		else if (isEmpty()) {
			stack.add(elm);
			topPos++;
			size++;
			return true;
		}
		else if (!isEmpty() && (elm.getClass() == stack.get(topPos).getClass())) {
			stack.add(elm);
			topPos++;
			size++;
			return true;
		}
		
		return false;
	}
	
	@Override
	public Object pop() {
		if(!isEmpty()) {
			Object topTmp = stack.get(topPos);
			size--;
			topPos--;
			return topTmp;
		}
		else {
			System.out.println("ERROR: Nothing to pop, empty stack.");
			return null;
		}
	}

	@Override
	public void setCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		maxSize = initialCapacity;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return topPos < 0 ? null : stack.get(topPos);
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
