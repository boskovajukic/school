/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.schoolboskovajukic;

import student.Student;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                        
        Student info = new Student("Petar", "Petrovic", 1990);
        
//        info.setFirstName("Petar");
//        info.setLastName("Petrovic");
//        info.setYearOfBirth(1990);
        
        info.showData();
        System.out.println("________________");
                
    }
    
}
