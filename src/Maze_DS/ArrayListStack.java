/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package DataStructures; Moved ArrayList stack into Maze runner.
package Maze_DS;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import java.util.ArrayList;

/**
 *
 * @author Mobile Unit M
 * 
 * Within our ArrayListStack class we begin to implement the methods the mouse
 * will use in order to execute movement on our Maze runner.
 */
public class ArrayListStack<T> implements StackADT<T> {
    
    private int length;
    
    private ArrayList<T> stack;
    
    public ArrayListStack(){
      stack = new ArrayList<>();//This is going to have any type passed into it.
    }
    
    /**
     * 
     * @param element 
     * For our push method we simply only added a new element to the arraylist.
     */
    @Override
    public void push(T element) {
            stack.add(element); 
    }
    /*
    @return T Returning the value at top that got popped.
    The ArrayList check if it is empty if it is the stack is empty, however 
    if the arraylist finds an element we make the array list pop the LAST 
    element out of it to make it act like a stack.
    */
    @Override
    public T pop() throws EmptyCollectionException {
        
        if(stack.isEmpty()){ // If our staack is empty our program tells us.
                throw new EmptyCollectionException ("Empty Stack");
            }
        
        T e  = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1); 
        return e;    
    } 
    
    /**
     * 
     * @return
     * @throws EmptyCollectionException 
     * Within our arrayList peek method the stack will check the last 
     * element within it.
     */
    @Override
    public T peek() throws EmptyCollectionException {
      if(stack.isEmpty()){ 
           throw new EmptyCollectionException ("test");
           }
        T r = stack.get(stack.size() - 1);
        return r;
        
        
    }
    /**
     * 
     * @return
     * The stack is empty.
     */
    @Override
    public boolean isEmpty() {//No generics needed.
        return (stack.size()==0);//Return value.
    }

    /**
     * 
     * @return
     * As the stack size increases the stack will update it's size through
     * this method.
     */
    @Override
    public int size() {
        return stack.size();//In length will update as my psuedo stack fills.
    }
    /**
     * 
     * @return
     * We didn't use to String, so it us using the base template.
     */
    @Override
    public String toString() {
        return "ArrayListStack{"+ stack + "length=" + length + '}';
    }
}//End of Class
