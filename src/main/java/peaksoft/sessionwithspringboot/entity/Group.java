package peaksoft.sessionwithspringboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @GeneratedValue(
            generator = "group_gen",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "group_gen",
            sequenceName = "group_seq",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String description;

    @OneToMany(cascade = {ALL}, mappedBy = "group")
    private List<Student> students;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }


}
