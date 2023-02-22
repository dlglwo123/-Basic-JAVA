package Section1.Conditonal;
//시,분,초를 입력받아 1초를 더한 결과값을 특정 형태의 메시지로 리턴
public class ConditionalEX16 {
    public static void main(String[] args) {
        String output = addOneSecond(14,17,59);
        System.out.println(output);
    }
    public static String addOneSecond(int hour, int minute, int second) {
        if(0 <= hour && hour < 24 && 0 <= minute && minute < 60 && 0 <= second && second < 60){
            second = second + 1;

            if(second == 60)
            {
                second = 0;
                minute = minute + 1;
                if(minute == 60)
                {
                    minute = 0;
                    hour = hour + 1;

                    if(hour == 24)
                    {
                        hour = 0;
                    }
                }
            }
            return "1초 뒤에 " + hour + "시 " + minute + "분 " + second +"초 입니다";
        }
        return null;
    }
}
