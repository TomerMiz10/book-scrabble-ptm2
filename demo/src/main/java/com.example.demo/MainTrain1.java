package com.example.demo;

public class MainTrain1 {
    //server test
    public static void serverAndClientTest(){
        Server server = new Server();
        Thread thread = new Thread(server);
        thread.start();
        server.connectClient();
    }
    //buttons test
    public static void buttonsTest(){

    }


    //Main
    public static void main(String[] args) {
           serverAndClientTest();
           buttonsTest();
    }
}