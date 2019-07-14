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
        return new Actor("Neelanshi","female",23);
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanLifeCycle() {
        return new BeanLifecycleDemoBean();
    }

}
