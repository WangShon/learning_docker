package com.sonkq.librarymanagement.library.repository;

import com.sonkq.librarymanagement.library.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select s.first_name, s.last_name, s.phone_number, s.email, s.address  from student s where s.id = :id", nativeQuery = true)
    Student getStudentById(@Param("id") Long id);

    @Query(value = "select * from student s where s.id = :id", nativeQuery = true)
    Student findAllById(@Param("id") Long id);
}
