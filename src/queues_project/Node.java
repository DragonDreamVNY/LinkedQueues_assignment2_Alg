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
public class Node {
    private Employee data; //
    private Node next;
    
    public Node(){ } //init Node
    
    // constructors
    public Node(Employee newEmployeeData, Node newTail) { 
        data = newEmployeeData;
        next = newTail;
    } //end populate new Node
    
    // getter or Accessor methods
    public Node getNext(){
        return next;
    }
    
    public Employee getData(){
        return data;
    }
    
    // setter or Modifier methods
    public void setNext(Node newNext){
        next = newNext;
    }
    
    public void setData(Employee newData){ 
        data = newData;  // newElement for Node
    }
 
}// end Node Class
