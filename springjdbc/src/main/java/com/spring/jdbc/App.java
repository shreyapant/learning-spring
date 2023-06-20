package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started..." );
        //spring jdbc=>JdbcTemplate
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        //INSERT
//        Student student=new Student();
//        student.setId(4448);
//        student.setName("Kritik");
//        student.setCity("New Delhi");
//        int result = studentDao.insert(student);
//        System.out.println("student added: "+ result);
        
        //UPDATE
//        Student student=new Student();
//        student.setId(444);
//        student.setName("Raj Kumar");
//        student.setCity("Lucknow");
//        int result = studentDao.change(student);
//        System.out.println("data changed"+result);
        
        //DELETE
//        int result = studentDao.delete(444);
//        System.out.println("deleted "+result);
        
//        SELECTING SINGLE OBJECT
//        Student student = studentDao.getStudent(211);
//        System.out.println(student);
        
//        SELECTING MULTIPLE OBJECTS
        List<Student> students = studentDao.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);
        }
        
    }
}
