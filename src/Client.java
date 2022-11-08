import javax.swing.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//https://mkyong.com/java/java-rmi-hello-world-example/
public class Client {
    private Client(){}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);

            QuadraticEquation stub = (QuadraticEquation) registry.lookup("Hello");
            Double a = Double.valueOf(JOptionPane.showInputDialog("Input a"));
            Double b = Double.valueOf(JOptionPane.showInputDialog("Input b"));
            Double c = Double.valueOf(JOptionPane.showInputDialog("Input c"));
            JOptionPane.showMessageDialog(null, stub.solveQuadraticEquation(a,b,c));
        } catch (RemoteException | NotBoundException e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
