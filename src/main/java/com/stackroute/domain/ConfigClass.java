package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


    @Configuration
    public class ConfigClass {

//	Movie Beans

        @Bean
        public Movie movie (){
            return new Movie();
        }

        @Bean
        public Actor actor (){
            return new Actor("Neelanshi","female",23);
        }

        @Bean
        public Actor actor1 (){
            return new Actor("Rohit","male",26);
        }
}
