package com.example.Student_management.repository;

import com.example.Student_management.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student , Integer> {
Student findAllById (int id );
@Query("SELECT YEAR (s.dateNaissance), COUNT(s) FROM Student s GROUP BY YEAR(s.dateNaissance)")
    Collection<Object[]>findNbrStudentByYear();
}
