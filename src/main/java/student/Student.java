/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
 
    private  String firstName;
    private  String lastName;
    private  int yearOfBirth;
    
    
    
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
    }
    
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth){
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
        
}
    
    public String getFirstName() {
                return this.firstName;
    }
                
    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }

    
    public String getLastName() {
                return this.lastName;
    }
    
    public void setLastName( String customLastName) {
        this.lastName = customLastName;
    }
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth(int customYearOfBirth) {
                this.yearOfBirth = customYearOfBirth;
    }
    
    
    public void showData() {
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        
        
    }
}
