package com.example.chess_project.Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Objects;


public class SerwerConnection {
    private ArrayList<ServerClientSockets> clientsSocets = new ArrayList<>();

    private ServerSocket serverSocket;


    private ServerClientSockets mainSocket = new ServerClientSockets();

    private final ComunicationHelper comunicationHelper = new ComunicationHelper();

    public void startSerwer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void setMainSocket(ServerClientSockets serverClientSockets) {
        mainSocket = serverClientSockets;
    }


    public void connectNewPlayer() throws IOException {
        ServerClientSockets clientSockets = new ServerClientSockets();
        clientSockets.SocketSending = serverSocket.accept();
        clientSockets.SocketGetting = serverSocket.accept();
        setMainSocket(clientSockets);
        this.clientsSocets.add(clientSockets);

    }

    public ServerClientSockets getClientSockets(int nr_off_player) {
        return this.clientsSocets.get(nr_off_player);
    }

    public void sendObjectToClient(Object object) throws IOException {
        comunicationHelper.setServerClientSockets(mainSocket);
        comunicationHelper.sendObjectToClient(object);
    }

    public Object getObjectFromClient() throws IOException, ClassNotFoundException {
        comunicationHelper.setServerClientSockets(mainSocket);
        return comunicationHelper.getObjectFromClient();
    }

}
