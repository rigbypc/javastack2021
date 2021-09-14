package soen345;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
    @Test
    public void basicStackTest()
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

    @Test
    public void iteratorStackTest() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer expected = 1;
        for (Integer actual : stack) {
            assertEquals(expected, actual);  
            expected ++;
        }

        assertTrue(!stack.isEmpty());

        //FIFO
        Vector<Integer> v = new Vector<Integer>();

        assertEquals(v.iterator().getClass(), stack.iterator().getClass());
    }

    


}
