package peaksoft.sessionwithspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import peaksoft.sessionwithspringboot.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("update Student set fullName = :fullName, age = :age where id = :id")
    void updateStudent(@Param("id") Long id, @Param("fullName") String fullName, @Param("age") int age);

    @Query("select s from Student s where s.fullName like  concat('%', :word, '%')")
    List<Student> searchStudents(String word);

    @Query
    Student searchStudent();
}