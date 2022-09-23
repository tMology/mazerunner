/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mobile Unit M
 */
public class ArrayListStackTest {
    
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     * Pushes a object in and tests the size of the stack.
     */
    @Test
    public void testPush() {//Using test components inside method.
        System.out.println("push");
        Object element = null;
        ArrayListStack instance = new ArrayListStack();//Object NOT an arrayList
        instance.push(element);
        assertEquals(1,instance.size());
    }

    /**
     * Test of pop method, of class ArrayListStack.
     * Tests removing a object form the stack and produces a new size for the
     * ArrayList stack
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        instance.push(expResult);
        Object result = instance.pop();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of peek method, of class ArrayListStack.
     * Forces the method to push into the ArrayListStack and trys to peek for
     * it
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        Object expResult = null;
        instance.push(expResult);
        Object result = instance.peek();// Does not take parameters
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     * Runs a boolean to check if the ArrayListStack is empty.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        boolean expResult = true;//was false
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of size method, of class ArrayListStack.
     * Inserts an integer and checks to see if the ArrayListStack size is 
     * updated.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ArrayListStack.
     * Yet again, the toString is left at its base template.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayListStack instance = new ArrayListStack();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
