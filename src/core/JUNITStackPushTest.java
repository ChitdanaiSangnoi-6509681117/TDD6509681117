package core;

import junit.framework.TestCase;

public class JUNITStackPushTest extends TestCase {
	public void testPush() {
        Stack stack = new Stack();
        
        assertTrue(stack.push(1));  
        assertEquals(1, stack.getSize());
        assertEquals(1, stack.top());
        
        assertTrue(stack.push(2));  
        assertEquals(2, stack.getSize());
        assertEquals(2, stack.top());
        
        assertFalse(stack.push("string"));  
        assertEquals(2, stack.getSize());  
        assertEquals(2, stack.top()); 
}
}