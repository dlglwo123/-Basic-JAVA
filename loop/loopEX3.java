package Section1;
//자연수 1부터 n까지의 곱을 계산하는 함수
public class loopEX3 {
    public static void main(String[] args) {
        int output = factorial(5);
        System.out.println(output);
    }

    public static int factorial(int num){
        int result = 1;
        for(int i = 1; i < num+1; i++) //0을 곱하면 0이 되기때문에 초기값을 1로 잡고 1을 더한이유는 1부터 5까지면 < 6으로 잡아야함
        {
            result *= i; //곱셈 연산자
        }
        return result;
    }
}
