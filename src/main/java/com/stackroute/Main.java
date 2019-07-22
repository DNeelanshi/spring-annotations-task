package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


        public static void main( String[] args )
        {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.domain");

                //calling different beans for movie class
            Movie movie1 = context.getBean("movieBean1",Movie.class);
            movie1.display();

            Movie movie2 = context.getBean("movieBean2",Movie.class);
            movie2.display();

            Movie movie3 = context.getBean("movieBean3",Movie.class);
            movie3.display();

            Movie movie4 = context.getBean("movieBean3",Movie.class);

                //matching if they are true or not
            System.out.println(movie3 == movie4);

                
            Movie movie5 = (Movie) context.getBean("movieBean1");
            movie5.display();


        }
}
