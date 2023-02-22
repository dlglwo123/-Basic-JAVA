package Section1.loop;

import org.w3c.dom.ls.LSOutput;

//문자열을 입력받아 각 문자(letter) 뒤에 해당 문자의 인덱스가 추가된 문자열을 리턴
public class loopEX14 {
    public static void main(String[] args) {
        String output = characterAndNumber("hello");
        System.out.println(output);
    }
    public static String characterAndNumber(String word) {
        String result = "";
        int length = word.length();

        for(int i = 0; i < length; i++){
            result = result + word.charAt(i) + i;

        }
        return result;
    }
}
