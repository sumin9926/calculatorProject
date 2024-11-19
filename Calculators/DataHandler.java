package Calculators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DataHandler {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    /*사용자로부터 숫자를 입력 받아 반환하는 메서드*/
    Double requestNumberInput() throws IOException {
       while(true) {
           try {
               String stringTypeNum = br.readLine();
               GenericNumber<Double> num = new GenericNumber<>();
               num.setNumber(Double.valueOf(stringTypeNum));
               return num.getNumber();
           } catch (IOException e) {
               throw new RuntimeException(e);
           } catch (NumberFormatException n) {
               System.out.println("숫자 형식으로 입력하세요. ex) 3, 2.4");
           }
       }
    }

    /*연산자를 입력받는 메서드*/

}