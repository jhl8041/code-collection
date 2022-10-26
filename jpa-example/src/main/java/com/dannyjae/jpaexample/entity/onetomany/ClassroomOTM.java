package com.dannyjae.jpaexample.entity.onetomany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class ClassroomOTM {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String classroomName;

  @OneToMany
  @JoinColumn(name = "classroomOTM_id")
  private List<StudentOTM> studentOTMList = new ArrayList<>();

  public ClassroomOTM(String classroomName) {
    this.classroomName = classroomName;
  }
}
