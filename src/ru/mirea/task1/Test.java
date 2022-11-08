package ru.mirea.task1;

public class Test {
    public static void main(String[] args) {
        Object object = new Object();
        Thread ping = new Thread(new PingPongObject( "Ping",object));
        Thread pong = new Thread(new PingPongObject("Pong",object ));
        ping.start();
        pong.start();
    }
}
