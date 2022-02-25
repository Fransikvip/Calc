package by.epam.rpn.chekan;

import by.epam.rpn.chekan.PolishCalc;

public class Main {
    public static void main(String[] args) {
        System.out.println(PolishCalc.expressionToRPN("2+3*3"));
        System.out.println(PolishCalc.rpnToReply(PolishCalc.expressionToRPN("2+3*3")));
    }
}
