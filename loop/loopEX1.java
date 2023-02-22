package Section1.loop;
//수를 입력받아 0부터 합을 리턴
public class loopEX1 {
    public static void main(String[] args) {
        int sum = sumTo(3);
        System.out.println(sum);

    }
    public static int sumTo(int num){
        int result = 0;
        for(int i = 0; i <= num; i++){
            result += i;
        }
        return result;
    }
}
