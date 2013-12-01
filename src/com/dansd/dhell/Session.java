package com.dansd.dhell;

import static java.lang.System.*;

public class Session {
    private String sessionToken;
    private int timeOfInitiation;

    public Session(){
        timeOfInitiation = (int) (currentTimeMillis() / 1000L);
    }
    protected void generateSessionToken(){

    }
}
