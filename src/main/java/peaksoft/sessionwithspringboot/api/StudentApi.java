package peaksoft.sessionwithspringboot.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.sessionwithspringboot.entity.Student;
import peaksoft.sessionwithspringboot.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentApi {

    private final StudentService service;

    @RequestMapping(value = "/search/{word}", method = RequestMethod.GET)
    public List<Student> searchStudents(@PathVariable("word" ) String word) {
        return service.searchStudents(word);
    }

}
