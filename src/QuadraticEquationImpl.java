import java.rmi.RemoteException;

public class QuadraticEquationImpl implements QuadraticEquation {
    private double D;
    private String answer;
    @Override
    public String solveQuadraticEquation(double a, double b, double c) throws RemoteException {
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            answer = ("Roots of the quadratic equation: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            answer = ("The equation has a single root: x = " + x);
        }
        else {
            answer = ("The equation has no real roots!");
        }
        return answer;
    }
}
