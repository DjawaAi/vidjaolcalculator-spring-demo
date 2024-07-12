package com.vidjaolcalculator.vidjaolcalculatorspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class VidjaOlCalController {
    private final CalculatorService calculatorService;

    public VidjaOlCalController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String vidjaOlCalGreet() {
        return calculatorService.vidjaOlCalGreet();
    }

    @GetMapping(path = "/plus")
    public String calculatorAdd(@RequestParam(value = "num1", required = false) Float summand1, @RequestParam(value = "num2", required = false) Float summand2) {
        return calculatorService.calculatorAdd(summand1, summand2);
    }

    @GetMapping(path = "/minus")
    public String calculatorDifference(@RequestParam(value = "num1", required = false) Float diminutive, @RequestParam(value = "num2", required = false) Float deductible) {
        return calculatorService.calculatorDifference(diminutive, deductible);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam(value = "num1", required = false) Float multipliable, @RequestParam(value = "num2", required = false) Float multiplier) {
        return calculatorService.calculatorMultiply(multipliable, multiplier);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam(value = "num1", required = false) Float divisible, @RequestParam(value = "num2", required = false) Float divider) {
        return calculatorService.calculatorDivide(divisible, divider);
    }

    // @RequestMapping
    //public String vidjaOCal() {
    //  return calculatorService.vidjaOCal();
    //}
}

