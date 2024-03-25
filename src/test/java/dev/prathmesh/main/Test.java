package dev.prathmesh.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appC.xml");
        Employee emp = (Employee) context.getBean("forQ");
        emp.show();
    }

}
