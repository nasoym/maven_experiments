package com.sinangoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class App 
{

  @Autowired
  Output output;

  public static void main( String[] args ) {
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-context.xml"});
    App app = (App)context.getBean("app");
    app.saySomething();
  }


  public App() {
  }

  public void saySomething() {
    output.saySomething("hello ddddddddddddddd");
  }
}
