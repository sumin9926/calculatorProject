package Calculators;

public class Numbers<T extends Number> {
    private T number;

    /*Setter*/
    public void setNumber1(T number){
        this.number=number;
    }

    /*Getter*/
    public T getNumber1(){
        return number;
    }
}
