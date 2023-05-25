package peaksoft.sessionwithspringboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(
            generator = "student_gen",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "student_gen",
            sequenceName = "student_seq",
            allocationSize = 1
    )
    private Long id;
    private String fullName;
    private int age;

    @ManyToOne(cascade = {
            REFRESH,
            DETACH,
            MERGE,
            PERSIST})
    private Group group;

}
