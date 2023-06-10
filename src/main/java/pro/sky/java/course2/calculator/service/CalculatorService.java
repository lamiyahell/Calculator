package pro.sky.java.course2.calculator.service;

public interface CalculatorService {
    String welcomeCalculator();
    int answerPlus(int num1, int num2);
    int answerMinus(int num1, int num2);
    int answerMultiply(int num1, int num2);
    int answerDivide(int num1, int num2);
}
