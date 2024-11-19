package Calculators;

import java.io.IOException;

public class NewCalculate {
    InputData inputData=new InputData();
    private Double num1,num2;

    void newCalculate() throws IOException {
        System.out.println("----------------------------------");
        System.out.println("새 연산을 시작합니다.\n");
        /*피연산자 불러오기*/
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1=inputData.getOperand();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2=inputData.getOperand();
        /*연산자 불러오기*/

    }

}
