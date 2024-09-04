package org.ojl3g.mvc_academy.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "students")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private int level;

    @ManyToOne
    @JoinColumn(name = "number_group" , nullable = false)
    private Group group;

    private Date lastTime;

}
