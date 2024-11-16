package com.example.Student_management.services;

import com.example.Student_management.entities.Student;
import com.example.Student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
 @Autowired
 private StudentRepository studentRepository;
 public Student save (Student student){
     return studentRepository.save(student);

 }
 public boolean delete(int id){
     Optional<Student> studentOptional = Optional.ofNullable(studentRepository.findAllById(id));
     if (studentOptional.isPresent()){
         studentRepository.delete(studentOptional.get());
         return true;

     }else {return false;}
 }
 public List<Student> findAll(){
     return studentRepository.findAll();
 }
 public long countStudent(){
     return studentRepository.count();
 }
 public Collection<?>findNbrStudentByYear(){
     return studentRepository.findNbrStudentByYear();
 }
}
