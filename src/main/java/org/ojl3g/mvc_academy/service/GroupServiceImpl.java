package org.ojl3g.mvc_academy.service;

import org.ojl3g.mvc_academy.model.Group;
import org.ojl3g.mvc_academy.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group saveGroup(Group group) {
        groupRepository.save(group);
    }

    @Override
    public Group getGroupById(Long id) {
        return groupRepository.getReferenceById(id);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public Group updateGroup(Group group) {
        if (groupRepository.existsById(group.getId())) {
            return groupRepository.save(group);
        }
        return null;
    }

    @Override
    public List<Group> getGroupByNumber(int number) {
        return groupRepository.findByNumber(number);
    }


}
