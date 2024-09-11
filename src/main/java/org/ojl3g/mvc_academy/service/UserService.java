package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.dto.UserLoginDTO;
import org.ojl3g.mvc_academy.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void save(User user);

    User getStudent(int id);

    List<User> getAllStudents();

    void deleteStudent(int id);

    User updateStudent(User user);

    List<User> getStudentByGroup(int group);

    User getStudentByLoginAndPassword(String login, String password);

    User findUserByLoginAndPassword(UserLoginDTO userLoginDTO);

}
