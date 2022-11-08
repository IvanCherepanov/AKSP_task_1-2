import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends QuadraticEquationImpl {
    public Server() {
    }

    public static void main(String[] args) {
        try {
            QuadraticEquationImpl obj = new QuadraticEquationImpl();

            QuadraticEquation stub = (QuadraticEquation) UnicastRemoteObject.exportObject(obj,0);

            Registry registry = LocateRegistry.getRegistry();

            registry.bind("Hello",stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
