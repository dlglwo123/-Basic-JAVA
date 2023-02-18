package Section1;
// 두 수를 입력받아 두 수의 차이를 나타내는 메세지를 리턴해야함.
public class Example6 {
    public static void main(String[] args) {
        String str = computeDifference(1,5);
        System.out.println(str);
    }
    public static String computeDifference(int num1,int num2)
    {
        int result = num1 - num2; //차를 나타내는 변수 result
        return String.format("%d, %d의 차이는 %d입니다.", num1, num2, Math.abs(result));
        // String format : 문자열의 형식을 설정하는 메서드
        // Math.abs : 두수의
    }
}
