package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Override
    public void save(Student student) {

    }

    @Override
    public Student getStudent(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getStudentByGroup(int group) {
        return List.of();
    }

    @Override
    public Student getStudentByLoginAndPassword(String login, String password) {
        return null;
    }
}
