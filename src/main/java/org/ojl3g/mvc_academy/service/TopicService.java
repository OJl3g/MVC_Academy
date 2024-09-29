package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Topic;

import java.util.List;

public interface TopicService {
    Topic saveTopic(Topic topic);

    Topic getTopicById(Long id);

    List<Topic> getAllTopics();

    void deleteTopic(Long id);

    Topic updateTopic(Topic topic);

    List<Topic> getTopicByName(String name);
}
