package Calculators;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        InputData data=new InputData();
        Scanner sc=new Scanner(System.in);
        String command="";//계산기 제어 명령어

        while(!command.equals("exit")){
                System.out.println("원하는 명령어를 입력하세요.");
                System.out.println("이전 값 보기: last, 첫 번째 값 변경: change, 첫 번째 값 삭제: delete");
                System.out.println("연산 종료: exit, 새 연산: 아무거나 입력");
                command = sc.nextLine();
                switch (command) { //따로 클래스 만들 예정
                    case "last":
                        System.out.println("이전 값: " + cal.getAnsList());
                        break;
                    case "change":
                        int value=data.inputPositiveInt("변경을 원하는");
                        cal.setAnsList(value);
                        System.out.println("변경되었습니다.\n");
                        break;
                    case "delete":
                        if(cal.deleteFirstData()){
                            System.out.println("첫 번째 값 삭제 성공\n");
                        }else{
                            System.out.println("삭제 실패\n");
                        }
                        break;
                    case "exit":
                        break;
                    default:
                        System.out.println("----------------------------------");
                        System.out.println("새 연산을 시작합니다.");
                        cal.calculator(); //연산 수행
                        break;
                }
        }
        System.out.println("계산기를 종료합니다.");
    }
}