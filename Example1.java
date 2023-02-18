package Section1;

// 문자 하나를 입력받아 알맞은 값(int) return 하기
public class Example1 {
    public static void main(String[] args) {

        int a = convertoNumber('9'); //9는 아스키코드값 57
        System.out.println(a);

    }

    public static int convertoNumber(char character){
        int result;
        result = (int)(character) - 48; // 57 - 48 = 9;
        return result;
    }
}
