package com.kaishengit.service;

import com.kaishengit.entity.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class StudentServiceTestCase {

    private static StudentService studentService = new StudentService();

    @Test
    public void findAllStudentsTest(){

        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Test
    public void deleteStudentByIdTest(){

        studentService.deleteStudentById(6);

    }

    @Test
    public void updateStudentTest(){

        Student student = new Student();
        student.setName("rose");
        student.setEmail("rose.qq.com");
        student.setId(1);
        Date date = new Date();
        student.setDob(date);
        studentService.updateStudent(student);

    }

    @Test
    public void findStudentByIdTest(){
        Student student = studentService.findStudentById(2);
        System.out.println(student.toString());
    }

    @Test
    public void insertStudentTest(){

        Student student = new Student();
        student.setName("rose");
        student.setEmail("rose.qq.com");
        Date date = new Date();
        student.setDob(date);
        studentService.createStudent(student);

       }

}
