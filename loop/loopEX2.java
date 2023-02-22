package Section1.loop;
//수를 입력받아 홀수인지 여부를 리턴
//1. 짝수인 경우 return false;
//2. 홀수인 경우 return true;
public class loopEX2 {
    public static void main(String[] args) {
        boolean oddNum = isOdd(-17);
        System.out.println(oddNum);
    }
    public static boolean isOdd(int num) {
        if (num < -0) {
            num = -num;
        }
        while (num > 0) {
            if (num == 1) {
                return true;
            }
            num = num - 2;
        }
        return false;
    }
}
