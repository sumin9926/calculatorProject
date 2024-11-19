package Calculators;

import java.io.*;
import java.util.LinkedList;

class Calculator {
    private LinkedList<Double> ansList=new LinkedList<>(); //연산 결과 저장용 필드
    NewCalculate newCalculate=new NewCalculate();
    DataHandler dataHandler=new DataHandler();
    /*계산기 실행 메서드*/
    void runCalculator() throws IOException {
        Double result=null;
        String command="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (!command.equals("exit")) {
            System.out.println("원하는 명령어를 입력하세요.");
            System.out.println("새 연산 시작: 아무키나 입력, 첫번째 데이터 삭제: delete, 마지막 값 출력: last, 첫번째 데이터 변경: change, 종료: exit");
            command = br.readLine();
            switch (command) {
                case "last":
                    System.out.println("이전 값: " + getAnsList() + "\n");
                    break;
                case "change":
                    System.out.println("변경하려는 값을 입력하세요: ");
                    setAnsList(dataHandler.requestNumberInput());
                    break;
                case "delete":
                    if (deleteFirstData()) {
                        System.out.println("첫 번째 값 삭제 성공\n");
                    } else {
                        System.out.println("삭제 실패\n");
                    }
                    break;
                case "exit":
                    break;
                default:
                    result = newCalculate.newCalculate();
                    ansList.offer(result); //연산 결과 저장
                    break;
            }
        }
        System.out.println("계산기를 종료합니다.");
    }

    /*연산 결과에 간접접근*/
    /*Getter*/
    public Double getAnsList(){
        int lastIndex=ansList.size()-1;
        if(lastIndex<0){
            System.out.println("이전 기록이 없습니다.");
            return null;
        }else return ansList.get(lastIndex); //이전 값 출력
    }

    /*Setter*/
    public void setAnsList(Double num){
        if(ansList.isEmpty()){
            System.out.println("저장된 결과 값이 없습니다.(변경불가)\n");
        }else {
            ansList.set(0,num);//첫 번째 값을 원하는 값으로 변경
            System.out.println("변경되었습니다.\n");
        }
    }

    /*첫번째 결과값을 삭제하는 메서드*/
    boolean deleteFirstData(){
        if(ansList.isEmpty()){
            return false;
        }else{
            Object firstNum=ansList.getFirst();
            return ansList.remove(firstNum);
        }
    }
}
