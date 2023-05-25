package peaksoft.sessionwithspringboot.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.sessionwithspringboot.entity.Group;
import peaksoft.sessionwithspringboot.service.GroupService;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
@RequiredArgsConstructor
public class GroupApi {

    private final GroupService groupService;

    // get all
    @GetMapping
    public List<Group> getAllGroups() {
       List<Group> groups = groupService.getAllGroups();
       return groups;
    }


    // find by id
    @GetMapping("/find/{id}")
    public Group findById(@PathVariable Long id) {
        Group groupById = groupService.findGroupById(id);
        return groupById;
    }

    // save
    // update
    // delete
}
