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

    public String calculatorAdd(Float summand1, Float summand2) {
        if (summand1 == null || summand2 == null) {
            return "Одна или несколько операнд не введена, нужно ввести переменную.";
        } else {
            float amount = summand1 + summand2;
            return summand1 + " + " + summand2 + " = " + amount;
        }
    }

    public String calculatorDifference(Float diminutive, Float deductible) {
        if (diminutive == null || deductible == null) {
            return "Одна или несколько операнд не введена, нужно ввести переменную.";
        } else {
            float difference = diminutive - deductible;
            return diminutive + " - " + deductible + " = " + difference;
        }
    }

    public String calculatorMultiply(Float multipliable, Float multiplier) {
        if (multipliable == null || multiplier == null) {
            return "Одна или несколько операнд не введена, нужно ввести переменную.";
        } else {
            float multiply = multipliable * multiplier;
            return multipliable + " * " + multiplier + " = " + multiply;
        }
    }

    public String calculatorDivide(Float divisible, Float divider) {
        if (divisible == null || divider == null) {
            return "Одна или несколько операнд не введена, нужно ввести переменную.";
        } else if (divider == 0.0) {
            return "На ноль делить нельзя - измените делитель";
        } else {
            float divide = divisible / divider;
            return divisible + " / " + divider + " = " + divide;
        }

    }
}
