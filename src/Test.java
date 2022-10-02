import java.util.Set;
public class Test { //this program tests our class
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 20, 6);
        Set<Double> roots = quadraticEquation.solver();
        if (!roots.isEmpty()) {
            System.out.println("Equation roots:");
            for (Double root : roots) {
                System.out.println(root);
            }
        }
    }
}