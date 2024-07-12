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
    public String calculatorAdd(@RequestParam("num1") float summand1, @RequestParam("num2") float summand2) {
        return calculatorService.calculatorAdd(summand1, summand2);
    }

    @GetMapping(path = "/minus")
    public String calculatorDifference(@RequestParam("num1") float diminutive, @RequestParam("num2") float deductible) {
        return calculatorService.calculatorDifference(diminutive, deductible);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam("num1") float multipliable, @RequestParam("num2") float multiplier) {
        return calculatorService.calculatorMultiply(multipliable, multiplier);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam("num1") float divisible, @RequestParam("num2") float divider) {
        return calculatorService.calculatorDivide(divisible, divider);
    }

    // @RequestMapping
    //public String vidjaOCal() {
    //  return calculatorService.vidjaOCal();
    //}
}

