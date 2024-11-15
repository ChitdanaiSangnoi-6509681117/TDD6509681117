# JUnit Stack Testing

This repository contains JUnit tests for a `Stack` data structure. The tests cover basic stack operations such as `push`, `pop`, `top`, `getSize`, and the initial state of the stack.

**Type of Testing**

The provided code exemplifies **white-box testing**. This is because the tests have knowledge of the `Stack`'s internal implementation. They directly interact with methods like `getSize()` and `top()` to check the internal state of the stack after each operation.

**Test Cases**

* **JUNITStackPushTest:** Tests the `push` operation, including:
    * Successful pushes
    * Size updates after pushing elements
    * Verification of the top element after pushes
    * Handling of invalid data types (e.g., pushing a string onto an integer stack)

* **JUNITPopTest:** Tests the `pop` operation, including:
    * Popping from an empty stack
    * Popping elements from a populated stack
    * Correctly updating the size and top element after popping
    * Emptying the stack and handling pop attempts on an empty stack

* **IStackTest:** Tests the initial state of a newly created stack:
    * Verifying the size is 0
    * Ensuring `isEmpty()` returns `true`

**Sample Code**

Here's an example of one of the test cases (`JUNITPopTest.java`):

```java
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
