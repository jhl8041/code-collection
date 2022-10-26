package com.dannyjae.jpaexample.repository;

import com.dannyjae.jpaexample.entity.twoway.ClassroomTW;
import com.dannyjae.jpaexample.entity.twoway.StudentTW;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTWRepository extends JpaRepository<StudentTW, Long> {
}
