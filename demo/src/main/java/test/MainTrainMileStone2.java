package test;

import view.Server;

public class MainTrainMileStone2 {
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