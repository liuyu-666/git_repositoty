package com.kaishengit.service;

import com.kaishengit.entity.Student;
import com.kaishengit.entity.StudentMapper;
import com.kaishengit.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentService {
    private Logger logger = LoggerFactory.getLogger(StudentService.class);
    private SqlSession sqlSession = MyBatisSqlSessionFactory.OpenSession();
    private   StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    public List<Student> findAllStudents(){
        try {
            return studentMapper.findAllStudents();
        } finally {
            sqlSession.close();
        }

    }

    public Student findStudentById(int id){
        logger.debug("select student id :" + id);
        try {
            return studentMapper.findStudentById(id);
        } finally {
            sqlSession.close();
        }
    }
    public void createStudent(Student student){
        logger.debug("the new student was creaed :" + student.getName());
        try {
            studentMapper.insertStudent(student);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }
}
