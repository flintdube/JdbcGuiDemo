/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcguiprojectdemo.Model;

/**
 *
 * @author Photo.M
 */
public class Student {
    
   int _student_id; 
   String _firstname;
   
   private static Student instance = new Student(101,"Liddon");
   
   private Student(int _student_id, String _firstname){
       this._student_id=_student_id;
       this._firstname=_firstname;
   }
   
   public static Student getInstance(){
   return instance;
   }
   @Override
   public String toString(){
   return String.format("%-5d %-10s", _student_id, _firstname);
   }
   
}
