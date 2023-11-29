package core;

import junit.framework.TestCase;

public class JUNITPopTest extends TestCase {
	public void testPop() {
        Stack stack = new Stack();
        
        assertNull("sad", stack.pop());  
        
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());  
        assertEquals(1, stack.getSize());  
        assertEquals(1, stack.top());  
        assertEquals(1, stack.pop());  
        assertEquals(0, stack.getSize());  
        assertNull(stack.top());  
        assertNull(stack.pop()); 
    }
	
}