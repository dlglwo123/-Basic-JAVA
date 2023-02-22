package Section1.Conditonal;
//온도를 입력받아 해당 온도가 30이 넘는지 확인 후 알맞은 값을 리턴
public class ConditionalEX2 {
    public static void main(String[] args) {
        String output = isGreaterThan(30);
        System.out.println(output);
        output = isGreaterThan(29);
        System.out.println(output);

    }

    public static String isGreaterThan(int temp) {
        if (temp >= 30) {
            return "에어컨을 켜야겠다!";
        } else {
            return "여름이 매우 덥네요.";
        }
    }
}