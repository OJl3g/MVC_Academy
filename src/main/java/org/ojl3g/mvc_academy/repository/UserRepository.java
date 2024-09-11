package org.ojl3g.mvc_academy.repository;

import org.ojl3g.mvc_academy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLoginAndPassword(String login, String passwor);
}
