package Section1.Example;
// 숫자를 입력받아 알맞은 문자를 리턴한다.
public class Example2 {

    public static void main(String[] args) {
        char character = convertToChar(9);
        System.out.println(character); //출력
    }

    public static char convertToChar(int num1) //return 값이 char 입력받는 값 int 형
    {
        char ch = (char)(num1 + 48); //'9'의 값은 57
        return ch; // 다시 converToChar에 리턴하고 이 값을 character 값에 대입
    }
}
