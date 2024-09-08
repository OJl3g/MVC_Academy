package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.User;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Override
    public void save(User user) {

    }

    @Override
    public User getStudent(int id) {
        return null;
    }

    @Override
    public List<User> getAllStudents() {
        return List.of();
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public User updateStudent(User user) {
        return null;
    }

    @Override
    public List<User> getStudentByGroup(int group) {
        return List.of();
    }

    @Override
    public User getStudentByLoginAndPassword(String login, String password) {
        return null;
    }
}
