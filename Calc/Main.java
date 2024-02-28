package Calc;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3));
        System.out.println(calculator.sum(new int[]{2, 3, 5}));
        System.out.println(calculator.sum(5,5,2,3,10));
        System.out.println(calculator.difference(5,3));
        System.out.println(calculator.dividing(6,0));
        System.out.println(calculator.multiplication(2,3));
    }
}
