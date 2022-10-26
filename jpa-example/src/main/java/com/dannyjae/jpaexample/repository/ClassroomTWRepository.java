package com.dannyjae.jpaexample.repository;

import com.dannyjae.jpaexample.entity.twoway.ClassroomTW;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomTWRepository extends JpaRepository<ClassroomTW, Long> {
}
