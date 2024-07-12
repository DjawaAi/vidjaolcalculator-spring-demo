package com.vidjaolcalculator.vidjaolcalculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String vidjaOCal() {
        return "<b>Калькулятор";
    }

    public String vidjaOlCalGreet() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorAdd(float summand1, float summand2) {
        float amount = summand1 + summand2;
        return summand1 + " + " + summand2 + " = " + amount;
    }

    public String calculatorDifference(float diminutive, float deductible) {
        float difference = diminutive - deductible;
        return diminutive + " - " + deductible + " = " + difference;
    }

    public String calculatorMultiply(float multipliable, float multiplier) {
        float multiply = multipliable * multiplier;
        return multipliable + " * " + multiplier + " = " + multiply;
    }

    public String calculatorDivide(float divisible, float divider) {
        if (divider == 0.0) {
            return "На ноль делить нельзя - измените делитель";
        } else {
            float divide = divisible / divider;
            return divisible + " / " + divider + " = " + divide;
        }
    }
}
