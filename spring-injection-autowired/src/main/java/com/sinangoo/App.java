package com.sinangoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App 
{

  Output output;

  @Autowired
  public void setOutput(Output output) {
    this.output = output;
  }

  public static void main( String[] args ) {
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});
    App app = (App)context.getBean("App");
    app.saySomething();
  }


  public App() {
  }

  public void saySomething() {
    output.saySomething("hello ddddddddddddddd");
  }
}
