package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


    @Configuration
    public class ConfigClass {

//	Movie Beans

        @Bean
        public Movie movieObj (){
            return new Movie(actorObj());
        }

        @Bean
        public Actor actorObj (){
            return new Actor("neelanshi","female",30);
        }

        @Bean
        public BeanPostProcessorDemoBean beanPostProcessorDemo(){
            return new BeanPostProcessorDemoBean();
        }

        @Bean (initMethod = "initialize", destroyMethod="clean")
        public BeanLifecycleDemoBean beanLifecycleDemoBean(){
            return new BeanLifecycleDemoBean();
        }

}
