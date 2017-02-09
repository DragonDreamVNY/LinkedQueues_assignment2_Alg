package queues_project;


/**
 * @author k00223361 Vincent Lee
 * LinkedQueue - assignment 2 - FIFO
 */
public class LinkedQueue {
    
    private Node head; 
    private Node tail;
    int     qSize;       //items in the Queue
    private Node tempPtr; //temporary pointer for traversing Queue nodes to Print
    private Node searchPtr; 
    
    // Constructor
	public LinkedQueue() { // Initialize empty Queue
            head = tail = null;
            qSize = 0;        
        } // Initialises an object of type LinkedQueue
	
  	public int size( ) {
            return qSize;
        } //return the number of elements stored in the queue
  	
        public boolean isEmpty() { // test whether the queue is empty
        if (head == null)
                   return true;
                else
                   return false;
           }   	

        public Employee front( ){ // return the front element of the queue
            if (isEmpty()) { 
                System.out.println("Stack is empty."); 
            }
            return head.getData();
        }
        
	// update methods
        
         // Append a new object on top of the stack
        public void append(Employee employeeData) {   
            Node newTail = new Node( ); //create a new Node object for the end of the Queue
            newTail.setData(employeeData);
            newTail.setNext(null);
            if (qSize == 0){
                head = newTail;
            }
            else{
                tail.setNext(newTail);
            }
            tail = newTail; //point tail to next 
            qSize++; //increase count or size of queue 
        } // end Append
        
        
        
        public Employee serve( ){ // return and remove the front element
            Employee oldHead;
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return null;
            }
            oldHead = head.getData();
            head = head.getNext(); //adjust head
            qSize--;
            return oldHead;
        }
        
        public String searchQueue(String searchTest){
            String result =""; //for status output
            searchPtr = head;
            
            while(searchPtr != null) {
                if( ((searchPtr.getData().getLastName().toUpperCase()) ).equals(searchTest) ) {
                    System.out.println("Employee Surname is... "+ searchPtr.getData().getLastName());
                    result = searchPtr.getData().toString(); //will return this to print Student Details
                    System.out.println("name found" + result);
                    return result; //for printing in MainFrame
                }
                else {
                    System.err.println("no name found");
                    searchPtr = searchPtr.getNext();  
                } //end else
            } //end while
            return result;
        }//end Search
} //end LinkedQueue
