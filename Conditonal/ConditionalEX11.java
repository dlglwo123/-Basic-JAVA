package Section1.Conditonal;
/* 두 개의 수를 입력받아 아래의 2가지 조건을 모두 만족하는지 검사
1. 적어도 하나의 수는 짝수이다.
2. 두 수 모두 9보다 작다.
*/
public class ConditionalEX11 {
    public static void main(String[] args) {
        boolean output = isEitherEvenAndLessThan9(8,9);
        System.out.println(output);
    }
    public static boolean isEitherEvenAndLessThan9(int num1, int num2) {
        if(num1 % 2 == 0 || num2 % 2 ==0){
            if(num1 < 9 && num2 < 9){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
