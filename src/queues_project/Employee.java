
package queues_project;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class Employee {
    
    private int employeeID;
    private String firstName;
    private String lastName;
    private int age;

    //getters and setters
    public int getEmployeeID() { return employeeID; }

    public void setEmployeeID(int employeeID) { this.employeeID = employeeID; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    //constructor
    public Employee(int employeeID, String firstName, String lastName, int age) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    
    @Override
    public String toString(){
        return "\n" + this.employeeID + "\t Name" + this.firstName + " " + this.lastName + "\t age: " + this.age +"\n";
    }
    
    
} //end Employee class
