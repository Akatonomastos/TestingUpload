
package studentcourses;

import java.util.ArrayList;

public class Studentcourses{

/**
 * @author peete
 */

    public static void main(String[] args) {
      
     ArrayList<Student> Students = new ArrayList<Student>() ;
        
      Student S1 = new Student("Babis","11214");
      
      Course C1 = new Course("Java", 5);
      Course C2 = new Course("Math", 5);
      
      S1.addCourse(C1);
      S1.addCourse(C2);
      
      S1.printInfo();
      
      GraduateStudent GS1 = new GraduateStudent("Takis", "11010", "Papadakis");
      
      GS1.addCourse(C1);
      GS1.addCourse(C2);
      GS1.printInfo();
       
      
    }
    
}
