package org.ojl3g.mvc_academy.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "groups")
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int number;

    private String classSchedule; //расписание занятий

    @OneToMany(mappedBy = "group")
    private List<User> users;

    @ManyToMany(mappedBy = "group")
    @JoinTable(
            name = "group_topic",
            joinColumns = @JoinColumn(name = "id_group",referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(name = "id_role",referencedColumnName = "id")
    )
    private Set<Topic> topics = new HashSet<>();

}
