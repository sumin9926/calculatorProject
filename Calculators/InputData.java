package Calculators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    /*사용자로부터 피연산자를 입력 받는 메서드*/
    Numbers<Double> inputNumbers() throws IOException {
        try{
            String stringTypeNum=br.readLine();
            Numbers<Double> num=new Numbers<>();
            num.setNumber(Double.valueOf(stringTypeNum));
            return num;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException n){
            System.out.println("숫자 형식으로 입력하세요. ex) 3, 2.4");
            return null;
        }
    }
    /*입력받은 피연산자를 반환하는 메서드*/
    Double getOperand() throws IOException {
        Double operand=null;
        while(operand==null){
            operand = inputNumbers().getNumber();
        }
        return operand;
    }

    /*연산자를 입력받는 메서드*/

}