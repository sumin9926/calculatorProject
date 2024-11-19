package Calculators;

public class Numbers<T extends Number> {
    private T number;

    /*Setter*/
    public void setNumber(T number){
        this.number=number;
    }

    /*Getter*/
    public T getNumber(){
        return number;
    }
}
