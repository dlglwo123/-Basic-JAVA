package Section1.loop;
//밑(base)과 지수(exponent)를 입력받아 밑의 거듭제곱을 리턴
public class loopEX15 {
    public static void main(String[] args) {
        int out = computePower(-2, 0);
        System.out.println(out);
    }
    public static int computePower(int base, int exponent) {
        int result = base;

        for(int i =0; i < exponent - 1; i++){
            result *= base;
        }
        if(base == 0 || exponent == 0){
            result = 1;
            return result;
        }
        return result;
    }
}
