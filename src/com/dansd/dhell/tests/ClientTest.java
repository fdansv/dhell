package com.dansd.dhell.tests;

import com.dansd.UDP.Messenger;

public class ClientTest {
    public static void main(String[] args) {
        Messenger messenger = new Messenger("localhost", 9190);
        messenger.send("hello".getBytes());
    }
}
