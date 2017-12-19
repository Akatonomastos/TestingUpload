/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourses;

import java.util.ArrayList;

/**
 *
 * @author peete
 */
public class Student {

    private String name;
    private String id;
    private ArrayList<Course> courses = new ArrayList<Course>();
        
    public Student(String aName, String anID){
        name = aName;
        id = anID;
        }
    
    public void addCourse(Course aCourse){
        courses.add(aCourse);
    }
    
    public void printInfo(){
        System.out.println("-------------");
        System.out.println("Name: "+ name);
        System.out.println("Id: "+id);
       
        for(Course course : courses){
            System.out.printf("%s ",course.getName());
            System.out.println(course.getCredits());
            
        }
        System.out.println("-------------");
    }
    
}
