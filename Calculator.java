import java.util.Scanner;

public class Calculator {
    int x;
    int y;
    int result;

    double doubleX;
    double doubleY;
    double doubleResult;

    public Calculator() {

    }

    public void addNumbers(int x, int y) {
        result = x + y;
    }

    public void subtractNumbers(int x, int y) {
        result = x - y;
    }

    public void multiplyNumbers(int x, int y) {
        result = x * y;
    }

    public void divideNumbers(int x, int y) {
        result = x / y;
    }

    public void powerNumbers(double doubleX, double doubleY) {
        doubleResult = Math.pow(doubleX, doubleY);
    }

    public void squarerootNumber(double doubleX) {
        doubleResult = Math.sqrt(doubleX);
    }

    public void absNumber(int x) {
        result = Math.abs(x);
    }

    public void floorNumber(double doubleX) {
        result = (int)Math.floor(doubleX);
    }

    public void ceilingNumber(double doubleX) {
        result = (int)Math.ceil(doubleX);
    }

    public void factorialNumber(int x) {
        result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
    }

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        Scanner scan = new Scanner(System.in);

        // Add number
        System.out.println("addNumber, Enter the first number:");
        myCalculator.x = scan.nextInt();
        System.out.println("addNumber, Enter the second number:");
        myCalculator.y = scan.nextInt();
        myCalculator.addNumbers(myCalculator.x, myCalculator.y);
        System.out.println("The Adder produced : " + myCalculator.result);
        System.out.println();

        // Subtract number
        System.out.println("subtractNumber, Enter the first number:");
        myCalculator.x = scan.nextInt();
        System.out.println("subtractNumber, Enter the second number:");
        myCalculator.y = scan.nextInt();
        myCalculator.subtractNumbers(myCalculator.x, myCalculator.y);
        System.out.println("The Subtractor produced : " + myCalculator.result);
        System.out.println();

        // Multiply number
        System.out.println("multiplyNumber, Enter the first number:");
        myCalculator.x = scan.nextInt();
        System.out.println("multiplyNumber, Enter the second number:");
        myCalculator.y = scan.nextInt();
        myCalculator.multiplyNumbers(myCalculator.x, myCalculator.y);
        System.out.println("The Multiplyor produced : " + myCalculator.result);
        System.out.println();

        // Divide number
        System.out.println("divideNumber, Enter the first number:");
        myCalculator.x = scan.nextInt();
        System.out.println("divideNumber, Enter the second number:");
        myCalculator.y = scan.nextInt();
        myCalculator.divideNumbers(myCalculator.x, myCalculator.y);
        System.out.println("The Dividor produced : " + myCalculator.result);
        System.out.println();

        // Power number
        System.out.println("powerNumber, Enter the first number:");
        myCalculator.doubleX = scan.nextDouble();
        System.out.println("powerNumber, Enter the second number:");
        myCalculator.doubleY = scan.nextDouble();
        myCalculator.powerNumbers(myCalculator.doubleX, myCalculator.doubleY);
        System.out.println("The Power produced : " + myCalculator.doubleResult);
        System.out.println();

        // Squareroot number
        System.out.println("squarerootNumber, Enter the number:");
        myCalculator.doubleX = scan.nextDouble();
        myCalculator.squarerootNumber(myCalculator.doubleX);
        System.out.println("The Power produced : " + myCalculator.doubleResult);
        System.out.println();

        // Abs number
        System.out.println("absNumber, Enter the number:");
        myCalculator.x = scan.nextInt();
        myCalculator.absNumber(myCalculator.x);
        System.out.println("The Absor produced : " + myCalculator.result);
        System.out.println();

        // Floor number
        System.out.println("floorNumber, Enter the number:");
        myCalculator.doubleX = scan.nextDouble();
        myCalculator.floorNumber(myCalculator.doubleX);
        System.out.println("The Floor produced : " + myCalculator.result);
        System.out.println();

        // Ceiling number
        System.out.println("ceilingNumber, Enter the number:");
        myCalculator.doubleX = scan.nextDouble();
        myCalculator.ceilingNumber(myCalculator.doubleX);
        System.out.println("The Ceiling produced : " + myCalculator.result);
        System.out.println();

        // Factorial number
        System.out.println("factorialNumber, Enter the number:");
        myCalculator.x = scan.nextInt();
        myCalculator.factorialNumber(myCalculator.x);
        System.out.println("The Factorial produced : " + myCalculator.result);

        scan.close();
    }

}
