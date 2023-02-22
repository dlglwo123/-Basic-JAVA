package Section1.Conditonal;
// 두개의 수를 입력받아 구번째 수가 첫번째 수보다 큰지 여부 리턴
public class ConditionalEX4 {
    public static void main(String[] args) {
        boolean output = isGreaterThan(11, 10);
        System.out.println(output);
    }
    public static boolean isGreaterThan(int num1, int num2){
        if(num2 > num1){
            return true;
        }
        else{
            return false;
        }
    }
}
