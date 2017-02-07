/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues_project;

/**
 *
 * @author DragonDream
 */
public class LinkedQueues {
    
    private Node first; 
    private Node last;
    int     size;       //items in the Queue
    private Node tempPtr; //temporary pointer for traversing Stack nodes to Print
    
    // Constructor
	public LinkedQueue() { // Initialize empty Queue
            first = last = null;
            size = 0;     
        }
        
        } // Initialises an object of type LinkedQueue
	// accessor methods
  	public int size( ) {
            return size;
        } //return the number of elements stored in the queue
  	
        public boolean isEmpty( ){ // test whether the queue is empty
        if (top == null)
                   return true;
                else
                   return false;
           }   	


public Employee front( ) // return the front element of the queue
    		
	// update methods
  	public void append (Employee obj); // insert an element at the rear
  	public Object serve( ) // return and remove the front element

}
