package com.sonkq.librarymanagement.library.service;

import com.sonkq.librarymanagement.library.dto.StudentDTO;
import com.sonkq.librarymanagement.library.model.Student;
import com.sonkq.librarymanagement.library.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static final Integer DELETE_FLAG = 1;
    @Autowired
    StudentRepository studentRepository;

    List<Student> studentList = new ArrayList<>();

    public StudentService() {
        super();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    public void addStudent(StudentDTO studentDto) {
        Student student = new Student();

        if (!StringUtils.isEmpty(studentDto.getFirstName())) {
            student.setFirstName(studentDto.getFirstName());
        }
        if (!StringUtils.isEmpty(studentDto.getLastName())) {
            student.setLastName(studentDto.getLastName());
        }
        if (!StringUtils.isEmpty(studentDto.getAddress())) {
            student.setAddress(studentDto.getAddress());
        }
        if (!StringUtils.isEmpty(studentDto.getEmail())) {
            student.setEmail(studentDto.getEmail());
        }
        if (!StringUtils.isEmpty(studentDto.getPhoneNumber())) {
            student.setPhoneNumber(studentDto.getPhoneNumber());
        }
        studentList.add(student);
        studentRepository.saveAll(studentList);
    }

    public void updateStudent(Long id, StudentDTO studentDto) {
        Student student = studentRepository.findAllById(id);

        if (!StringUtils.isEmpty(studentDto.getFirstName())) {
            student.setFirstName(studentDto.getFirstName());
        }
        if (!StringUtils.isEmpty(studentDto.getLastName())) {
            student.setLastName(studentDto.getLastName());
        }
        if (!StringUtils.isEmpty(studentDto.getAddress())) {
            student.setAddress(studentDto.getAddress());
        }
        if (!StringUtils.isEmpty(studentDto.getEmail())) {
            student.setEmail(studentDto.getEmail());
        }
        if (!StringUtils.isEmpty(studentDto.getPhoneNumber())) {
            student.setPhoneNumber(studentDto.getPhoneNumber());
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findAllById(id);
        student.setDeleteFlag(DELETE_FLAG);
        studentRepository.save(student);
    }
}
