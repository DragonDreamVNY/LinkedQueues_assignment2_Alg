package queues_project;


/**
 * @author k00223361 Vincent Lee
 * LinkedQueue - assignment 2 - FIFO
 */
public class LinkedQueue {
    
    private Node headOfQ; 
    private Node tailOfQ;
    int     qSize;       //items in the Queue
    private Node tempPtr; //temporary pointer for traversing Queue nodes to Print
    private Node searchPtr; 
    
    // Constructor
	public LinkedQueue() { // Initialize empty Queue
            headOfQ = tailOfQ = null;
            qSize = 0;        
        } // Initialises an object of type LinkedQueue
	
  	public int size( ) {
            return qSize;
        } //return the number of elements stored in the queue
  	
        public boolean isEmpty() { // test whether the queue is empty
        if (headOfQ == null)
                   return true;
                else
                   return false;
           }   	

        public Employee front( ){ // return the front element of the queue
            if (isEmpty()) { 
                System.out.println("Queue is empty. No Records Found"); 
            }
            return headOfQ.getData();
        }
        
        //move to end of queue
        public Employee back(){
            if (isEmpty()) { 
                System.out.println("Stack is empty."); 
            }
            return tailOfQ.getData();
        }
        
	// update methods
        
         // Append a new element to end of the Queue
        public void append(Employee employeeData) {   
            Node newTail = new Node( ); //create a new Node object for the end of the Queue
            newTail.setData(employeeData);
            newTail.setNext(null);
            if (qSize == 0){
                headOfQ = newTail;
            }
            else{
                tailOfQ.setNext(newTail);
            }
            tailOfQ = newTail; //point tail to reference of next 
            qSize++; //increase count or size of queue 
        } // end Append
        
        // return and remove the front element
        public Employee serve( ){ 
            Employee oldHead; 
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return null;
            }
            oldHead = headOfQ.getData();
            headOfQ = headOfQ.getNext(); //adjust head
            qSize--;
            return oldHead;
        } //end Serve
        
        public String searchQueue(String searchTest){
            String result = ""; //for status output
            searchPtr = headOfQ;
            
            while(searchPtr != null) {
                if( ((searchPtr.getData().getLastName().toUpperCase()) ).equals(searchTest) ) { //compare user input to this current surname in the records.
                    System.out.println("Employee Surname is... "+ searchPtr.getData().getLastName());
                    result = searchPtr.getData().toString(); //will return this to print Student Details
                    System.out.println("name found" + result);
                    return result; //for printing in MainFrame
                }
                else {
                    System.err.println("No name found");
                    searchPtr = searchPtr.getNext();
                } //end else
            } //end while
            return result;
        }//end Search
        
        public String printAllRecords(){
        String output = "";
        tempPtr = headOfQ;
        while(tempPtr != null){
            output += tempPtr.getData();
            //move to next node
            tempPtr = tempPtr.getNext();
        }
        return output;
    } //end PrintStack
        
} //end LinkedQueue
