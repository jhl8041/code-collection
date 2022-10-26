package com.dannyjae.jpaexample.repository;

import com.dannyjae.jpaexample.entity.manytoone.StudentMTO;
import com.dannyjae.jpaexample.entity.onetomany.StudentOTM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentOTMRepository extends JpaRepository<StudentOTM, Long> {
}
