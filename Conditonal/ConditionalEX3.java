package Section1.Conditonal;

import java.util.Objects;

// 수를 입력받아 10과 같은지 여부를 리턴
public class ConditionalEX3 {
    public static void main(String[] args) {
        boolean output = equalsTen(10);
        System.out.println(output);
    }

    public static boolean equalsTen(int num){
        //기본적인 개념
        int i = 10;
        if(num == 10)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
