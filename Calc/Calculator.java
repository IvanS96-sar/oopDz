package Calc;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int[] numbers){
        int res = 0;
        for(int num :numbers){
            res +=num;
        }
        return res;
    }
    public int sum(int firstNum, int...onterNums){
        for(int num : onterNums){
           firstNum+=num;
        }
        return firstNum;
    }
    public int difference(int a, int b){
        return a - b;
    }
    public int dividing(int a, int b){
        if(a != 0 && b != 0) {
            return  a / b;
        }else{
            System.out.println("Делить на ноль нельзя");
            return 0;
        }
    }
    public int multiplication(int a, int b){
        return a * b;
    }
}