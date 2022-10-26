package com.dannyjae.jpaexample.entity.manytoone;

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
public class ClassroomMTO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String classroomName;

  public ClassroomMTO(String classroomName) {
    this.classroomName = classroomName;
  }
}
