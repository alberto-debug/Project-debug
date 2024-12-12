package com.springproject.registration.Service;


import com.springproject.registration.model.Student;
import com.springproject.registration.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService  {

    private StudentRepository studentRepository;



    public Student registerStudent(Student student){

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id){

        return studentRepository.findById(id);
    }

    public Student getStudentByEmail(String email){

        return studentRepository.findByEmail(email);

    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }

}
