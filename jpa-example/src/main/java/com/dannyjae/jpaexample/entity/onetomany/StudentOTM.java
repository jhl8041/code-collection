package com.dannyjae.jpaexample.entity.onetomany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class StudentOTM {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String studentName;

  public StudentOTM(String studentName) {
    this.studentName = studentName;
  }
}
