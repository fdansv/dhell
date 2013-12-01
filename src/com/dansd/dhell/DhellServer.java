package com.dansd.dhell;

import com.dansd.UDP.Server;


public class DhellServer extends Server {
    public DhellServer(int i) {
        super(i);
    }

    @Override
    public byte[] onRequest(byte[] reqString) {
        Zeppelin thisZeppelin = new Zeppelin(reqString);
        String stringRequest = new String(reqString);
        System.out.println(stringRequest);
        String resultString = "";
        if (stringRequest.equals("hello")){

        }
        else if(stringRequest.equals("bye")){

        }
        else{
            resultString = "Bad expression";
        }
        byte[] result = resultString.getBytes();
        return result;
    }
}
