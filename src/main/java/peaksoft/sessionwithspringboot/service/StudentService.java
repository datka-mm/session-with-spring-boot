package peaksoft.sessionwithspringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.sessionwithspringboot.entity.Student;
import peaksoft.sessionwithspringboot.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    // save

    // with query

    // find by id
    // get all
    // delete
    // search List
    // getAllGroupStudents
    // searchStudent Student



    // update
    public void updateStudent(Long id, Student student) {
        studentRepository.updateStudent(id, student.getFullName(), student.getAge());
    }
    // delete

    // search
    public List<Student> searchStudents(String word) {
       return studentRepository.searchStudents(word);
    }

//    public Student searchStudent(String word) {
//        return studentRepository.ser
//    }

}
