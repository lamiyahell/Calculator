package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int answerPlus(int num1, int num2) {
        return num1 + num2;
    }
    public int answerMinus(int num1, int num2) {
        return num1 - num2;
    }
    public int answerMultiply(int num1, int num2) {
        return num1 * num2;
    }
    public int answerDivide(int num1, int num2) {
        return num1 / num2;
    }
}
