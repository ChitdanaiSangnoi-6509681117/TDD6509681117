package core;

import junit.framework.TestCase;

public class IStackTest extends TestCase {
	public void TestCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0, size);
		assertEquals(true, s1.isEmpty());
	}
}
