package com.sinangoo;

import javax.inject.Named;

@Named
public class Output 
{

  public Output() {
  }

  public void saySomething(String something) {
      System.out.println("say: " + something);
  }

}

