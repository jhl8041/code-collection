package com.dannyjae.jpaexample.entity.twoway;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Getter
@Entity
public class StudentTW {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String studentName;

  @ManyToOne
  @JoinColumn(name = "classroomtw_id")
  private ClassroomTW classroomTW;

  public StudentTW(String studentName) {
    this.studentName = studentName;
  }
}
