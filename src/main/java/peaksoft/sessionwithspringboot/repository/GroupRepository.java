package peaksoft.sessionwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import peaksoft.sessionwithspringboot.entity.Group;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {

    @Query("select g from Group g order by g.name desc ")
    List<Group> getAllSortedGroup();
}