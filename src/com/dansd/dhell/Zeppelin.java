package com.dansd.dhell;

import java.util.HashMap;

public class Zeppelin {

    private final byte[] requestString;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public HashMap getPayload() {
        return payload;
    }

    public void setPayload(HashMap payload) {
        this.payload = payload;
    }

    private String command;
    private HashMap payload;

    public Zeppelin(byte[] reqString) {
        this.requestString = reqString;
        decode();
    }
    private void decode() {
        parseCommand();
        parsePayload();
    }

}
