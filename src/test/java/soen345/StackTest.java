package soen345;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
    @Test
    public void stackTest()
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Last in First out (LIFO)

        assertEquals(3, stack.peek().intValue());
        
        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        
        assertTrue(stack.isEmpty());
        
    }


}
