package Section1.array;
import java.util.Arrays;
//수(num)를 입력받아 num번째까지 총 num + 1개의 피보나치 수열을 리턴해야 합니다.
//0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1입니다. 그 다음 2번째 피보나치 수부터는 바로 직전의 두 피보나치 수의 합으로 정의합니다.
public class arrEX14 {
    public static void main(String[] args) {
        int[]output = fibonacci(8);
        System.out.println(Arrays.toString(output));
    }

    public static int[] fibonacci(int num) {
        int f[] = new int[num + 1]; //배열 선언 0을 제외하고 하나 더 출력하기 위함

        for(int i = 0; i < f.length; i++){
            if(i <= 1){
                f[i] = i; //0과 1일 경우 0 1출력 문구
            }
            else{
                f[i] = f[i-2] + f[i-1]; //2번부터 시작 전전배열과 전 배열의 합을 현재 배열에 출력하기 위한 로직
            }
        }
        return f;
    }
}
