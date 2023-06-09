package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String answerPlus(int numb1, int numb2) {
        int sum = numb1+numb2;
        return numb1 + " + " + numb2 + " = " + sum;
    }
    public String answerMinus(int numb1, int numb2) {
        int dif = numb1-numb2;
        return numb1 + " - " + numb2 + " = " + dif;
    }
    public String answerMultiply(int numb1, int numb2) {
        int multiply = numb1*numb2;
        return numb1 + " * " + numb2 + " = " + multiply;
    }
    public String answerDivide(int numb1, int numb2) {
        int div = numb1/numb2;
            return numb1 + " / " + numb2 + " = " + div;
    }
}
