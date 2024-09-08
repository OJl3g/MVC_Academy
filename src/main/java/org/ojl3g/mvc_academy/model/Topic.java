package org.ojl3g.mvc_academy.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "topics")
@NoArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nameTopic;

    @ManyToMany(mappedBy = "topic")
    private Set<Group> groupTopics;

    @ManyToMany()
    @JoinTable(
            name = "user_topic",//название для связывающей таблицы (3 таблица)
            joinColumns = @JoinColumn(name = "user_id"), //(1 колонка для таблицы)
            inverseJoinColumns = @JoinColumn(name = "topic_id") //(2 колонка для таблицы)
    )
    private Set<User> users = new HashSet<>();
}
