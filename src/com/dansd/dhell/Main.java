package com.dansd.dhell;

import com.dansd.UDP.Server;

public class Main {

    public static void main(String[] args) {
	    ServerSession serverSession = new ServerSession();
        Server server = new DhellServer(9190);
        server.listen();
    }
}
