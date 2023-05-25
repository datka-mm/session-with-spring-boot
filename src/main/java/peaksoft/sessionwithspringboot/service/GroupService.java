package peaksoft.sessionwithspringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.sessionwithspringboot.entity.Group;
import peaksoft.sessionwithspringboot.repository.GroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public List<Group> getAllGroups() {
       List<Group> groups = groupRepository.getAllSortedGroup();
       return groups;
    }

    public Group findGroupById(Long id) {
        Group group = groupRepository.findById(id).orElseThrow(()->
                new NullPointerException("Group with id: " + id + " not found!"
                )
        );

        return group;
    }
}
