package com.dansd.dhell;

import com.dansd.UDP.Server;


public class DhellServer extends Server {
    public DhellServer(int i) {
        super(i);
    }

    @Override
    public byte[] onRequest(byte[] reqString) {
        String stringRequest = reqString.toString();
        Commands currentCommand = Commands.valueOf(stringRequest.toLowerCase());
        String resultString = "";
        switch (currentCommand){
            case hello:
            case bye:
            default:
                resultString = "Invalid command";
        }
        byte[] result = resultString.getBytes();
        return result;
    }

    public enum Commands {
        hello,
        bye
    }
}
