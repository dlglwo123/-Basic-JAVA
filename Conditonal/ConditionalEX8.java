package Section1.Conditonal;
// 두개의 수와 기호를 입력받아 알맞게 계산한 값을 리턴
public class ConditionalEX8 {
    public static void main(String[] args) {
        int output = miniCalculator(3,4,'+');
        System.out.println(output);


    }
    public static int miniCalculator(int num1, int num2, char operator){

        switch(operator){
            case '+' :
                return num1 + num2; // return이기 떄문에 break 사용 X 값을 return 했다면 밑에 실행문은 실행시키지않는다.
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '%' :
                return num1 % num2;
            default:
                return 0;
        }
    }
}
