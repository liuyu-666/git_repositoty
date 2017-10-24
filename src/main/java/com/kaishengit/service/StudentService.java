package com.kaishengit.service;

import com.kaishengit.entity.Student;
import com.kaishengit.mapper.StudentMapper;
import com.kaishengit.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentService {
    private Logger logger = LoggerFactory.getLogger(StudentService.class);
    private SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
    private   StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    public List<Student> findAllStudents(){

        try {
            return studentMapper.findAllStudents();
        } finally {
            sqlSession.close();
        }

    }
    public void deleteStudentById(int id) {
        try{
            studentMapper.deleteStudentById(id);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    public void updateStudent(Student student){
        try{
            studentMapper.updateStudent(student);
            sqlSession.commit();
        }finally {
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
