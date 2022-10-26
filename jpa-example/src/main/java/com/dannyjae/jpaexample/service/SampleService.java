package com.dannyjae.jpaexample.service;

import com.dannyjae.jpaexample.entity.manytoone.ClassroomMTO;
import com.dannyjae.jpaexample.entity.manytoone.StudentMTO;
import com.dannyjae.jpaexample.entity.onetomany.ClassroomOTM;
import com.dannyjae.jpaexample.entity.onetomany.StudentOTM;
import com.dannyjae.jpaexample.entity.twoway.ClassroomTW;
import com.dannyjae.jpaexample.entity.twoway.StudentTW;
import com.dannyjae.jpaexample.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {

  private final ClassroomMTORepository classroomMTORepository;
  private final StudentMTORepository studentMTORepository;

  private final ClassroomOTMRepository classroomOTMRepository;
  private final StudentOTMRepository studentOTMRepository;

  private final ClassroomTWRepository classroomTWRepository;
  private final StudentTWRepository studentTWRepository;

  // ManyToOne 단방향 맵핑 저장
  public void saveClassroomMTO() {
    ClassroomMTO classroomMTO = new ClassroomMTO("교실1");
    classroomMTO = classroomMTORepository.save(classroomMTO);

    List<StudentMTO> studentMTOList = new ArrayList<>();
    for (int i=1; i<=10; i++) {
      StudentMTO studentMTO = new StudentMTO("학생" + i);
      studentMTO.setClassroomMTO(classroomMTO);
      studentMTOList.add(studentMTO);
    }
    studentMTORepository.saveAll(studentMTOList);
  }

  // OneToMany 단방향 맵핑 저장
  public void saveClassroomOTM() {
    ClassroomOTM classroomOTM = new ClassroomOTM("교실1");
    for (int i=1; i<=10; i++) {
      classroomOTM.getStudentOTMList().add(new StudentOTM("학생" + i));
    }
    classroomOTMRepository.save(classroomOTM);
  }

  // 양방향 맵핑 저장
  public void saveClassroomTW(){
    ClassroomTW classroomTW = new ClassroomTW("교실1");
    for (int i=1; i<=10; i++) {
      classroomTW.getStudentTWList().add(new StudentTW("학생" + i));
    }
    classroomTWRepository.save(classroomTW);
  }
}
