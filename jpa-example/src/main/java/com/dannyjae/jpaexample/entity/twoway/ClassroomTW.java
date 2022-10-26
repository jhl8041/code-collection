package com.dannyjae.jpaexample.entity.twoway;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class ClassroomTW {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String classroomName;

  @OneToMany(mappedBy = "classroomTW", cascade = CascadeType.ALL)
  private List<StudentTW> studentTWList = new ArrayList<>();

  public ClassroomTW(String classroomName) {
    this.classroomName = classroomName;
  }
}
