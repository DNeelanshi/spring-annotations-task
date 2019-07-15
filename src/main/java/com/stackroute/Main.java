package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.BeanLifecycleDemoBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.domain");
        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
        BeanLifecycleDemoBean beanLifecycleDemoBean =  (BeanLifecycleDemoBean) context.getBean("beanLifeCycle");

    }
}
