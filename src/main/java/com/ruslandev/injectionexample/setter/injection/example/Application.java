package com.ruslandev.injectionexample.setter.injection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ApplicationCarSetterInjection.xml");

        Car myCar = (Car) applicationContext.getBean("myCar");
        myCar.displayDetails();
    }



}
