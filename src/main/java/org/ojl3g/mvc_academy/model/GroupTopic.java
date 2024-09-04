package org.ojl3g.mvc_academy.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "group_topics")
@NoArgsConstructor
public class GroupTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @ManyToOne()
    @JoinColumn(name = "topic_id", nullable = false)
    private Topic topic;


}
