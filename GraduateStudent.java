/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentcourses;

/**
 *
 * @author peete
 */
public class GraduateStudent extends Student {
    
    private String supervisor;
    
    public GraduateStudent(String aName, String anId,String aSupervisor){
        super(aName, anId);
        supervisor= aSupervisor;
    }
    
    public void printInfo(){
        super.printInfo();
        System.out.println(""+ "Supervisor is "+supervisor);
    }
}
