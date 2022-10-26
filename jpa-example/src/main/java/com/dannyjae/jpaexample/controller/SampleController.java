package com.dannyjae.jpaexample.controller;

import com.dannyjae.jpaexample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

  private final SampleService sampleService;

  @GetMapping("/api/many-to-one/save")
  public String saveClassroomManyToOne(){
    sampleService.saveClassroomMTO();
    return "SUCCESS";
  }

  @GetMapping("/api/one-to-many/save")
  public String saveClassroomOneToMany(){
    sampleService.saveClassroomOTM();
    return "SUCCESS";
  }

  @GetMapping("/api/two-way")
  public String saveClassroomTwoWay(){
    sampleService.saveClassroomTW();
    return "SUCCESS";
  }
}
