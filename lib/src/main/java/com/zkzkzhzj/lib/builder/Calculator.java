package com.zkzkzhzj.lib.builder;

public class Calculator {
    private String result;

    @Override
    public String toString() {
        return result;
    }

    public static class CalculatorBuilder{
        private Double number;
        private final StringBuilder log = new StringBuilder();
        private Boolean checkFirst = true;

        public CalculatorBuilder(long firstNum){
            number = (double) firstNum;
        }

        public CalculatorBuilder plusNumber(long num){
            if(checkFirst){
                log.append(number).append("+").append(num);
            } else {
                log.append("+").append(num);
            }
            number += num;
            checkFirst = false;
            return this;
        }

        public CalculatorBuilder minusNumber(long num){
            if(checkFirst){
                log.append(number).append("-").append(num);
            } else {
                log.append("-").append(num);
            }
            number -= num;
            checkFirst = false;
            return this;
        }

        public CalculatorBuilder multiplyNumber(long num){
            if(checkFirst){
                log.append(number).append("*").append(num);
            } else {
                log.append("*").append(num);
            }
            number *= num;
            checkFirst = false;
            return this;
        }

        public CalculatorBuilder divisionNumber(long num){
            if(checkFirst){
                log.append(number).append("/").append(num);
            } else {
                log.append("/").append(num);
            }
            number /= num;
            checkFirst = false;
            return this;
        }

        public Calculator build(){
            Calculator calculator = new Calculator();
            log.append("=").append(String.format("%.0f", number));
            calculator.result = log.toString();
            return calculator;
        }
    }
}

