package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Topic;
import org.ojl3g.mvc_academy.repository.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic); // Сохранение темы
    }

    @Override
    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElse(null); // Получение темы по ID
    }

    @Override
    public List<Topic> getAllTopics() {
        return topicRepository.findAll(); // Получение всех тем
    }

    @Override
    public void deleteTopic(Long id) {
        topicRepository.deleteById(id); // Удаление темы
    }

    @Override
    public Topic updateTopic(Topic topic) {
        if (topicRepository.existsById(topic.getId())) {
            return topicRepository.save(topic); // Обновление темы
        }
        return null;
    }

    @Override
    public List<Topic> getTopicByName(String name) {
        return topicRepository.findByNameTopic(name); // Поиск темы по имени
    }
}
