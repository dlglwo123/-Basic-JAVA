package Section1.array;
import java.util.Arrays;
// 짝수값 출력하기
public class arrEX5 {
    public static void main(String[] args) {
        int[] output = getEvenNumbers(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(output));
    }
    public static int[] getEvenNumbers(int[] arr) {
        int[]even = new int[]{}; // 배열 선언 : 배열값으로 함수를 받기 때문에

        if (arr.length == 0) {
            return new int[]{}; // 입력값이 없을때 빈배열 출력
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) // 기존 배열을 복사하면서,길이가 1 확장된 새로운 배열을 만든다.
            {
               even = Arrays.copyOf(even,even.length + 1); // Arrays.CopyOF : 오리지널 범위,복사하고자하는 총 범위를 넣어줌
               even[even.length - 1] = arr[i]; //새로운 배열에 마지막에 새롭게 발견된 짝수를 추가
            }
        }
        return even;
    }
}
