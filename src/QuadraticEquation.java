import java.util.Set;
import java.util.TreeSet;
public class QuadraticEquation {
    private final double CoeffA;
    private final double CoeffB;
    private final Discriminant discriminant;
    public QuadraticEquation(double CoeffA, double CoeffB, double CoeffC) { //constructor for quadratic equation
        this.CoeffA = CoeffA;
        this.CoeffB =  CoeffB;
        this.discriminant = new Discriminant(this.CoeffA, this.CoeffB, CoeffC);
    }
    public Set<Double> solver() { //this method returns roots of the equation or reports about mistake
        Set<Double> roots = new TreeSet<>();
        if (this.discriminant.isDiscriminantPossible()) {
            double x1 = (-this.CoeffB - this.discriminant.squareRoot()) / (2 * this.CoeffA);
            double x2 = (-this.CoeffB + this.discriminant.squareRoot()) / (2 * this.CoeffA);

            roots.add(x1);
            roots.add(x2);
        } else {
            System.out.printf("The equation has no real roots", this.discriminant.countDiscriminant());
        }
        return roots;
    }

    public static class Discriminant { //this class is made for the search of discriminant
        private final double CoeffA;
        private final double CoeffB;
        private final double CoeffC;
        public Discriminant(double CoeffA, double CoeffB, double CoeffC) {
            this.CoeffA = CoeffA;
            this.CoeffB = CoeffB;
            this.CoeffC = CoeffC;
        }
        public double countDiscriminant() { //this method counts the discriminant
            return Math.pow(this.CoeffB, 2) - 4 * this.CoeffA * this.CoeffC;
        }
        public double squareRoot() { //this method extracts the square root of the discriminant
            return Math.sqrt(countDiscriminant());
        }
        private boolean isDiscriminantPossible() { //this methos checks if discriminant is acceptable
            return this.countDiscriminant() >= 0;
        }
    }
}
