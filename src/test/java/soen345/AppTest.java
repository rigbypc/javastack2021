package soen345;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Stack;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void stackTest()
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop().intValue());
    }
}
