package ru.mirea.task2.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client(){}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);

            Hello stub = (Hello) registry.lookup("Hello");

            stub.printMsg();
        } catch (RemoteException | NotBoundException e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
