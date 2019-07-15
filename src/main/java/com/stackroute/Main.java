package com.stackroute;

import com.stackroute.domain.BeanPostProcessorDemoBean;
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

        Movie movie = context.getBean("movieObj",Movie.class);
        movie.display();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean =  (BeanPostProcessorDemoBean) context.getBean("beanPostProcessorDemo");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean)context.getBean("beanLifecycleDemoBean");
    }
}
