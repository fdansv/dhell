package com.dansd.dhell;

import com.dansd.UDP.Server;

public class Main {

    public static void main(String[] args) {
	    ServerSession serverSession = new ServerSession();
        Server server = new DhellServer(9190);
        server.listen();
        System.out.println("the system is listening very carefully, so give him a break");


    }
}
