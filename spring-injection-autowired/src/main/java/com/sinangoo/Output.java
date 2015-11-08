package com.sinangoo;

import org.springframework.stereotype.Service;

@Service
public class Output 
{

  public Output() {
  }

  public void saySomething(String something) {
      System.out.println("say: " + something);
  }

}

