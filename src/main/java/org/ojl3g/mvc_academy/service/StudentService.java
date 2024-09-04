package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void save(Student student);

    Student getStudent(int id);

    List<Student> getAllStudents();

    void deleteStudent(int id);

    Student updateStudent(Student student);

    List<Student> getStudentByGroup(int group);

    Student getStudentByLoginAndPassword(String login, String password);

}
