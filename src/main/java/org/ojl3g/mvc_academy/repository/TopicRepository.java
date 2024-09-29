package org.ojl3g.mvc_academy.repository;

import org.ojl3g.mvc_academy.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    List<Topic> findByNameTopic(String nameTopic);
}
