package Section1.array;
// 최댓값 출력하기
import java.util.Arrays;

public class arrEX3 {
    public static void main(String[] args) {
        int output = getLargestElement(new int[]{1, 4, 3});
        System.out.println(output);
    }

    public static int getLargestElement(int[] arr) {
        int max = arr[0]; // 최대값인 max에 arr[0] 초기값 선언

        for(int i = 0; i < arr.length; i++) //배열을 순환하면서 가장 큰 값이 max값에 할당
        {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max; //max 최대값 리턴
    }
}

