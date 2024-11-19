package Calculators;

public class Numbers<T extends Number, U extends Number> {
    private T number1;
    private U number2;

    /*Setter*/
    public void setNumber1(T number1){
        this.number1=number1;
    }
    public void setNumber2(U number2){
        this.number2=number2;
    }

    /*Getter*/
    public T getNumber1(){
        return number1;
    }
    public U getNumber2(){
        return number2;
    }
}
