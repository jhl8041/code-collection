package com.dannyjae.jpaexample;

import com.dannyjae.jpaexample.service.SampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaExampleApplicationTests {

  @Autowired
  SampleService sampleService;

  @Test
  public void saveClass() {
  }
}
