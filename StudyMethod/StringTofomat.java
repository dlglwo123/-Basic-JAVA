package Section1.StudyMethod;
import java.time.LocalDateTime;
//format 함수에 대해 정리노트

//예시
public class StringTofomat {
    public static void main(String[] args) {
        String str = "StingFormatExample";
        boolean bl = true;
        int n = 1234;
        LocalDateTime now = LocalDateTime.now(); //현재 년도 시간 날짜를 알려주는 LocalDateTime 함수

        String result = String.format("문자열 서식: %s, %S",str,str); //%s는 문자열로 %뒤에 대문자 소문자냐에 의해 자동 형변환이 된다
        System.out.println(result);
        result = String.format("Boolean 서식 문자열 : %b, %B",bl,bl);
        System.out.println(result);
        result = String.format("정수 서식: %d, %o, %x, %05d", n, n, n, n);
        System.out.println(result);  // %05d → 5자리수, 공백을 0으로 채움
        result = String.format("부동 소수점 서식: %4$e, %3$f, %2$g, %1$a", 1234.01, 1234.02, 1234.03, 1234.04);
        System.out.println(result);  // %숫자$ 로 절대 인수 인덱스 지정
        result = String.format("날짜/시간 서식: %tY년 %<tm월 %<td일 %<tH시 %<tM분 %<tS초", now); //%tY, %<tm, %<td ...
        System.out.println(result);
    }
}
