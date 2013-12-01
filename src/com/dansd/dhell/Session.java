package com.dansd.dhell;

import static java.lang.System.*;

public class Session {
    private String sessionToken;
    private int timeOfInitiation;
    private String ipAddress;

    public Session(){
        timeOfInitiation = (int) (currentTimeMillis() / 1000L);
    }
    public String getToken(){
        return sessionToken;
    }
    protected void generateSessionToken(){
        sessionToken = ipAddress+"-"+timeOfInitiation;
    }

}
