package com.stackroute.domain;

public class Movie {


    private Actor actor;


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display()
    {
        System.out.println("Actor Name is: "+actor.getName()+" with Gender: "+actor.getGender()+" and Age: "+actor.getAge() );
    }
}
