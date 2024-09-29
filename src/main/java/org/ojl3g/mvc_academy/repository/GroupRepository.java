package org.ojl3g.mvc_academy.repository;

import org.ojl3g.mvc_academy.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByNumber(int number);
}
