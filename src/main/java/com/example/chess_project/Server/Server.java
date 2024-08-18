package com.example.chess_project.Server;

import java.io.IOException;

public class Server {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        SerwerConnection serwerConnection = new SerwerConnection();
        serwerConnection.startSerwer(PORT);
        System.out.println("Serwer set, now connectiong clients");
    }
}
