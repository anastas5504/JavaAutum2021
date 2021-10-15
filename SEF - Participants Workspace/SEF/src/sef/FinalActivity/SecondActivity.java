package sef.FinalActivity;

 class Calculator {
    public double add(double int1, double int2) {
        return int1 + int2;
    }

    public double sub(double int1, double int2) {
        return int1 - int2;
    }

    public double mul(double int1, double int2) {
        return int1 * int2;
    }

    public double div(double int1, double int2) {
        return int1 / int2;
    }
}

public class SecondActivity {
    public static void main(String[] args) {
        System.out.println("==== Calculator ====");

        Calculator c = new Calculator();

        double sum = c.add(2.5, 3.75);
        double diff = c.sub(10, 3.25);
        double mul = c.mul(14, 12);
        double div = c.div(256, 4);

        System.out.println("Sum: 2.5 + 3.75 = " + sum);
        System.out.println("Diff: 10 - 3.25 = " + diff);
        System.out.println("Mul: 14 * 12 = " + mul);
        System.out.println("Div: 256 / 4 = " + div);
    }
}
