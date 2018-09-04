package com.sdcj.testTemplate.Repository;

import org.springframework.data.repository.CrudRepository;

import com.sdcj.testTemplate.entity.Student;

public interface StudentDao extends CrudRepository<Student, Long> {

}
