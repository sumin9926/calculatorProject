package Calculators;

import java.util.Scanner;

class InputData {
    Scanner sc=new Scanner(System.in);

    /*양의 정수를 입력 받는 메서드*/
    int inputPositiveInt(String seq){ //seq : 순서 입력
        double value;
        System.out.println(seq+" '양의 정수'를 입력하세요.");
        while(true) {
            value = sc.nextDouble();
            sc.nextLine(); //버퍼에 남은 \n 제거
            if (value % 1 != 0.0 || value < 0) {
                System.out.println("'양의 정수'를 입력하세요.");
            } else {
                break; //입력된 수가 양의 정수인 경우 반복 종료
            }
        }
        return (int)value; //double 타입을 int 타입으로 강제 형변환
    }

    /*연산자를 입력받는 메서드*/
    String inputOperator(){
        String operator;
        System.out.println("사칙연산 기호(+,-,*,/)를 입력하세요.");
        while (true) {
            operator = sc.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) break;
            else System.out.println("올바른 기호를 입력하세요.");
        }
        return operator;
    }
}