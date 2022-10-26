package com.dannyjae.jpaexample.entity.manytoone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class StudentMTO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String studentName;

  @ManyToOne
  @JoinColumn(name = "classroomMTO_id")
  ClassroomMTO classroomMTO;

  public StudentMTO(String studentName) {
    this.studentName = studentName;
  }
}
