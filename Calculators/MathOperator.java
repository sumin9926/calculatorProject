package Calculators;

public enum MathOperator {
    PLUS("+"), MINUS("-"), MULTIPLE("*"), DIVISION("/");

    private final String operator;

    MathOperator(String operator){
        this.operator=operator;
    }

    public String getOperator(){
        return operator;
    }
}
