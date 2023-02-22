package Section1.loop;
//수를 입력받아 약수(factor)의 합을 리턴
public class loopEX16 {
    public static void main(String[] args) {
        int out = getSumOfFactors(8);
        System.out.println(out);
    }
    public static int getSumOfFactors(int num) {
        int result = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                result += i;
            }
        }
        return result;
    }
}
