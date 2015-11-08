package com.sinangoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class App 
{

  @Inject
  Output output;

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
