package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Group;

import java.util.List;

public interface GroupService {
    Group saveGroup(Group group);

    Group getGroupById(Long id);

    List<Group> getAllGroups();

    void deleteGroup(Long id);

    Group updateGroup(Group group);

    List<Group> getGroupByNumber(int number);
}
