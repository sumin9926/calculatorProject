import java.util.Scanner;

public class Calculator_Lv1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value1, value2; //입력 받은 수를 저장할 변수
        int answer; //연산 결과
        String command="";//계산기 동작 명령어(반복문 제어에 사용)
        Calculator_Lv1 cal1=new Calculator_Lv1();
        /*계산기 시작*/
        while(!command.equals("exit")) {
            /*양의 정수 2개 입력받기*/
            System.out.println("첫 번째 '양의 정수'를 입력하세요.");
            value1 = cal1.checkNum();

            System.out.println("두 번째 '양의 정수'를 입력하세요.");
            value2 = cal1.checkNum();

            /*사칙연산 기호 입력받기*/
            System.out.println("사칙연산 기호(+,-,*,/)를 입력하세요.");
            String operator;
            while (true) {
                operator = sc.nextLine();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) break;
                else System.out.println("올바른 기호를 입력하세요.");
            }

            /*연산 수행*/
            switch (operator) {
                case "+":
                    answer = value1 + value2;
                    System.out.println(value1 + "+" + value2 + "=" + answer);
                    break;
                case "-":
                    answer = value1 - value2;
                    System.out.println(value1 + "-" + value2 + "=" + answer);
                    break;
                case "*":
                    answer = value1 * value2;
                    System.out.println(value1 + "*" + value2 + "=" + answer);
                    break;
                case "/":
                    if (value2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        answer = value1 / value2;
                        System.out.println(value1 + "/" + value2 + "=" + answer);
                        break;
                    }
            }

            System.out.println("exit를 입력하면 연산이 종료됩니다. 새로운 연산은 아무키나 입력하세요.");
            command=sc.nextLine();
        }
    }
    /*수 입력 및 입력된 수가 조건에 맞는지 확인하는 메서드*/
    int checkNum(){
        double value=0.0;
        Scanner sc=new Scanner(System.in);
        while(true) {
            value = sc.nextDouble();
            sc.nextLine(); //버퍼에 남은 \n 제거
            if (value % 1 != 0.0 || value < 0) { // '1-' 같은 이상한 숫자가 들어가면 터진다. 고민해보자.
                System.out.println("'양의 정수'를 입력하세요.");
            } else {
                break; //입력된 수가 양의 정수인 경우 반복 종료
            }
        }
        return (int)value; //double 타입을 int로 강제 형변환
    }

}