package Section1;
// 시간,분,초를 입력받아 현재 시각을 나타내는 메세지를 리턴한다.
public class Example5 {
    public static void main(String[] args) // 실행 구문 구현
    {
        String str = showTime(1, 34, 55);
        System.out.println(str);
    }
    public static String showTime(int hour, int min, int sec) //함수 구현
    {
        StringBuilder builder = new StringBuilder();
        builder.append("현재시각은 ").append(hour).append("시 ").append(min).append("분 ").append(sec).append("초 입니다."); //StringBuilder 사용
        String str = builder.toString();
        return str;
    }
}
