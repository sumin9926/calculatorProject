package Calculators;

import java.util.LinkedList;

class Calculator {
    /*필드*/
    private LinkedList<Integer> ansList=new LinkedList<>(); //연산 결과 저장용 필드

    /*사칙연산 수행 및 결과 반환 메서드*/
    void calculator(){
        int result=0;
        InputData data=new InputData();
        int value1=data.inputPositiveInt("첫 번째"); //정수1 입력
        int value2 = data.inputPositiveInt("두 번째"); //정수2 입력
        String operator = data.inputOperator(); //연산자 입력

        /*연산 시작*/
        switch (operator) {
            case "+":
                result = value1 + value2;
                System.out.println(value1 + "+" + value2 + "=" + result+"\n");
                break;
            case "-":
                result = value1 - value2;
                System.out.println(value1 + "-" + value2 + "=" + result+"\n");
                break;
            case "*":
                result = value1 * value2;
                System.out.println(value1 + "*" + value2 + "=" + result+"\n");
                break;
            case "/":
                if (value2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = value1 / value2;
                    System.out.println(value1 + "/" + value2 + "=" + result+"\n");
                }
                break;
        }
        ansList.offer(result); //연산 결과 저장
    }

    /*연산 결과에 간접접근*/
    /*Getter*/
    public int getAnsList(){
        int lastIndex=ansList.size()-2;
        if(lastIndex<0){
            System.out.println("이전 기록이 없습니다. 0을 반환합니다.");
            return 0;
        }else return ansList.get(lastIndex); //이전 값 출력
    }

    /*Setter*/
    public void setAnsList(int num){
        if(ansList.isEmpty()){
            ansList.add(num); //list 가 비어있는 경우 새 값 추가.
        }else ansList.set(0,num); //첫 번째 값을 원하는 값으로 변경
    }

    /*가장 먼저 저장된 데이터를 삭제하는 메서드*/
    boolean deleteFirstData(){
        if(ansList.isEmpty()){
            return false;
        }else{
            Object firstNum=ansList.getFirst();
            return ansList.remove(firstNum);
        }
    }
}
