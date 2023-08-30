package com.sonkq.librarymanagement.library.controller;

import com.sonkq.librarymanagement.library.dto.StudentDTO;
import com.sonkq.librarymanagement.library.model.Student;
import com.sonkq.librarymanagement.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable(value = "id") Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public void addUser(@RequestBody StudentDTO studentDto) {
        studentService.addStudent(studentDto);
    }

    @PutMapping("/student/{id}")
    public void updateUser(@PathVariable(value = "id") Long id, @RequestBody StudentDTO studentDto) {
        studentService.updateStudent(id,studentDto);
    }

    @PutMapping("/delete-student/{id}")
    public void deleteUser(@PathVariable(value = "id") Long id) {
        studentService.deleteStudent(id);
    }

}
