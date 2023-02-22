package Section1.Conditonal;
//수를 입력받아 짝수인지 홀수인지 여부를 리턴한다.
public class ConditionalEX5 {
    public static void main(String[] args) {
        boolean output = isEven(11);
        System.out.println(output);
    }
    public static boolean isEven(int num) {
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
