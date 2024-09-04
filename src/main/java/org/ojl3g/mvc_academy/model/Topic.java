package org.ojl3g.mvc_academy.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @OneToMany(mappedBy = "topic")
    private List<GroupTopic> groupTopics;
}
