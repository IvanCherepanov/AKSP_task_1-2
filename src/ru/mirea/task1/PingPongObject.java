package ru.mirea.task1;

public class PingPongObject implements Runnable {
    private String name;
    private Object object;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public PingPongObject(String name, Object object) {
        this.name = name;
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            while (true) {
                System.out.println(getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                object.notify();

                try {
                    object.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
