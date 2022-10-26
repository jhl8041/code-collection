package com.dannyjae.jpaexample.repository;

import com.dannyjae.jpaexample.entity.manytoone.StudentMTO;
import com.dannyjae.jpaexample.entity.twoway.ClassroomTW;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMTORepository extends JpaRepository<StudentMTO, Long> {
}
