package com.dansd.dhell;

import java.util.HashMap;
import java.util.Map;

public class ServerSession {
    private Map sessionMap = new HashMap<String, Session>();

    Session getSession(String token){
        return (Session) sessionMap.get(token);
    }
}
