package Calculators;

import java.io.IOException;

public class NewCalculate {
    DataHandler dataHandler=new DataHandler();
    private Double num1,num2,result; //피연산자
    private String operator; //연산자

    Double newCalculate() throws IOException {
        System.out.println("----------------------------------");
        System.out.println("새 연산을 시작합니다.\n");

        /*사용자에게 숫자 입력 요청하기*/
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1=dataHandler.requestNumberInput();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2=dataHandler.requestNumberInput();

        /*연산자 입력 요청하기*/
        System.out.print("연산자를 입력하세요.[+,-,*,/]: ");
        operator= dataHandler.requestOperator();

        /*연산 시작*/
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result+"\n");
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result+"\n");
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result+"\n");
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + result+"\n");
                }
                break;
        }
        return result;
    }

}
