package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping("/plus")
    public String answerPlus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.answerPlus(num1,num2);
        return textForm(num1, num2, result, '+');
    }

    @GetMapping("/minus")
    public String answerMinus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.answerMinus(num1,num2);
        return textForm(num1, num2, result, '-');
    }

    @GetMapping("/multiply")
    public String answerMultiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorService.answerMultiply(num1,num2);
        return textForm(num1, num2, result, '*');
    }

    @GetMapping("/divide")
    public String answerDivide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Второй аргумент 0, на 0 делить нельзя!";
        }

        int result = calculatorService.answerDivide(num1,num2);
        return textForm(num1, num2, result, '/');
    }

    private String textForm(int num1, int num2, int result, char action) {
        return String.format("%d %c %d = %d", num1,action,num2,result);
    }
}
