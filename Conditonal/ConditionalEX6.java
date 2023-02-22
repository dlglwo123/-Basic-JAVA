package Section1.Conditonal;
//수를 입력받아 입력된 수가 10보다 크고 짝수인지 여부를 리턴해야한다.
public class ConditionalEX6 {
    public static void main(String[] args) {
        boolean output = isEvenAndGreaterThanTen(13);
        System.out.println(output);
    }
    public static boolean isEvenAndGreaterThanTen(int num) {
        if(num > 10 && num % 2 == 0) // 10보다 크고 짝수일때 true
        {
            return true;
        }
        else{
            return false;
        }
    }
}
