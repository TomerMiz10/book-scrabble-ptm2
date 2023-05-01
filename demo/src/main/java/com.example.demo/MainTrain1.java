package com.example.demo;

public class MainTrain1 {
    public static void main(String[] args) {
           serverAndClientTest();
    }
    //server test
    public static void serverAndClientTest(){
        Server server = new Server();
        server.connectClient();
    }
}