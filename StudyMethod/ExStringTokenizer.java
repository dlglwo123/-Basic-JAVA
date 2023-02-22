package Section1.StudyMethod;

import java.util.StringTokenizer;

//StringTokenizer 예습
public class ExStringTokenizer {
    public static void main(String[] args) {
        String str = "This is StringTokenizer Example";
        StringTokenizer Token = new StringTokenizer(str); //Token이라는 인스턴스를 생성(str 토큰화 초기단계)
        System.out.println(str);
        System.out.println(Token.countTokens()); // Token 개수 확인 : 4

        while (Token.hasMoreTokens()) // Token이 남아있다면 While문 반복 없다면 종료
        {
            System.out.println(Token.nextToken()); //다음 토큰을 출력 후 반환한다.
        }
        System.out.println(Token.countTokens()); //남은 Token개수가 0이기 때문에  whila문이 종료되고 개수는 : 0
    }
}
