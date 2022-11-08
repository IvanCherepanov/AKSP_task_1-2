package ru.mirea.task2.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    void printMsg() throws RemoteException;
}
