package Calculators;

public class GenericNumber<T extends Number> {
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
