package com.dansd.dhell;

import com.dansd.UDP.Server;

/**
 * Created with IntelliJ IDEA.
 * User: fdans
 * Date: 01/12/13
 * Time: 18:52
 * To change this template use File | Settings | File Templates.
 */
public class DhellServer extends Server {
    public DhellServer(int i) {
        super(i);
    }

    @Override
    public byte[] onRequest(byte[] reqString) {
        String stringRequest = reqString.toString();
        switch(stringRequest){

        }
        return super.onRequest(reqString);
    }
}
