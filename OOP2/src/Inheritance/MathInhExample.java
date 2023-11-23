package Inheritance;

public class MathInhExample {
    public static void main(String[] args) {
        double basicMath = MathSuperAdvanced.addition(5, 7.5);
        System.out.println(basicMath);

        double intermediateMath = MathSuperAdvanced.subtraction(10.1, 9.8);
        System.out.println(intermediateMath);

        double advancedMath = MathSuperAdvanced.multiply(0.7, 48);
        System.out.println(advancedMath);

        double superAdvancedMath = MathSuperAdvanced.divide(110, 10);
        System.out.println(superAdvancedMath);
    }
}

class MathBasic {
    public static double addition(double a, double b) {
        return a + b;
    }
}

class MathIntermediate extends MathBasic {
    public static double subtraction(double a, double b) {
        return a - b;
    }
}

class MathAdvanced extends MathIntermediate {
    public static double multiply(double a, double b) {
        return a * b;
    }
}

class MathSuperAdvanced extends MathAdvanced {
    public static double divide(double a, double b){
        return  a / b;
    }
}
