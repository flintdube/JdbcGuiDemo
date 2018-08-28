/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcguiprojectdemo;

import jdbcguiprojectdemo.Model.Student;

import jdbcguiprojectdemo.Service.DBconnection;
/**
 *
 * @author Photo.M
 */
public class JdbcGuiProjectDemo {

    
    public static void main(String[] args) {
       DBconnection jdbc = DBconnection.getInstance();
       jdbc.getConnection();

       Student student = Student.getInstance();
        System.out.println(student.toString());
        //edited from github
        //commented from netbeans
       
    }
    
}
