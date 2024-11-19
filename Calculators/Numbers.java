package Calculators;

public class Numbers<T extends Number> {
    private T number;

    /*Setter*/
    public void setNumber1(T number1){
        this.number1=number1;
    }

    /*Getter*/
    public T getNumber1(){
        return number1;
    }
}
