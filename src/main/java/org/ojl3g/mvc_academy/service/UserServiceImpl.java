package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.dto.UserLoginDTO;
import org.ojl3g.mvc_academy.model.User;
import org.ojl3g.mvc_academy.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository  userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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

    @Override
    public User findUserByLoginAndPassword(UserLoginDTO userLoginDTO) {
       return userRepository.findByLoginAndPassword(userLoginDTO.getLogin(), userLoginDTO.getPassword());
    }
}
