package Section1.Conditonal;
// 두개의 boolean 값을 입력받아 or연산을 적용한 것과 같은 결과를 리턴
public class ConditionalEX15 {
    public static void main(String[] args) {
        boolean output = or(false,false);
        System.out.println(output);
    }
    public static boolean or(boolean expression1, boolean expression2) {
        if(expression1 == true){
            return true;
        }
        else if(expression2 == true){
            return true;
        }
        else{
            return false;
        }
    }
}
