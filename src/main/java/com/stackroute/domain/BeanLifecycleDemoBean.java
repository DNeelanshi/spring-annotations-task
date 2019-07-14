package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After PropertiesSet method");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method");
    }

    public void customInit(){
        System.out.println("Custom Init method");
    }

    public void customDestroy(){
        System.out.println("Destroy method");
    }
}
