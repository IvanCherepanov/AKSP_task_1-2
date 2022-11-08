package ru.mirea.task2.example;

import java.rmi.RemoteException;

public class HelloImpl implements Hello{
    @Override
    public void printMsg() throws RemoteException {
        System.out.println("This is example of RMI program");
    }
}
