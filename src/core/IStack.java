package core;

public interface IStack {
	boolean push(Object elm);
	Object pop() ;
	void setCapacity(int initialCapacity) ; 
	Object top() ;
	boolean isFull();
	int getSize();
	boolean isEmpty();
	
}
