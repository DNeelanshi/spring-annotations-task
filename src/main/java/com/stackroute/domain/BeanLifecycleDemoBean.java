package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements DisposableBean, InitializingBean {


    public void initialize ()
    {
        System.out.println("Initialization");
    }

    public  void clean()
    {
        System.out.println("custom destroy");
    }
    public void destroy ()
    {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }
}
