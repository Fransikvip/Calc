public class Main {
    public static void main(String[] args) {
        System.out.println(PolishCalc.expressionToRPN("3+3*3"));
        System.out.println(PolishCalc.rpnToReply(PolishCalc.expressionToRPN("3+3*3")));
    }
}
