package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {

    //	Movie Beans
    @Bean(name = {"movieBean1", "movieBean2"})
    public Movie movieBean1 (){
        Movie movie = new Movie(actor1());
        return movie;
    }

    @Bean
    public Movie movieBean2 (){
        Movie movie = new Movie(actor2());
        return movie;
    }

    // marking bean with scope prototype so that every time new instance will be created.
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean3 (){
        Movie movie = new Movie(actor3());
        return movie;
    }

    //	Actor Beans
    @Bean
    public Actor actor1 (){
        return new Actor("neelanshi","female",23);
    }

    @Bean
    public Actor actor2 (){
        return new Actor("rohit","male",26);
    }

    @Bean
    public Actor actor3 (){
        return new Actor("amit","male",30);
    }
}
