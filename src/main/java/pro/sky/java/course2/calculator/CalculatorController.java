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
    public String answerPlus(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calculatorService.answerPlus(numb1,numb2);
    }

    @GetMapping("/minus")
    public String answerMinus(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calculatorService.answerMinus(numb1,numb2);
    }

    @GetMapping("/multiply")
    public String answerMulriply(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calculatorService.answerMultiply(numb1,numb2);
    }

    @GetMapping("/divide")
    public String answerDivide(@RequestParam("num1") int numb1, @RequestParam("num2") int numb2) {
        return calculatorService.answerDivide(numb1,numb2);
    }
}
