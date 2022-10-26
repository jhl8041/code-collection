package com.dannyjae.jpaexample.repository;

import com.dannyjae.jpaexample.entity.manytoone.ClassroomMTO;
import com.dannyjae.jpaexample.entity.onetomany.ClassroomOTM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomOTMRepository extends JpaRepository<ClassroomOTM, Long> {
}
