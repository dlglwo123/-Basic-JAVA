package Section1.array;
import java.util.Arrays;
//입력된 수의 인덱스부터 출력하기
public class arrEX8 {
    public static void main(String[] args) {
        int[] output = getElementsAfter(new int[]{1, 3, 5, 7, 9}, 2);
        System.out.println(Arrays.toString(output));
    }

    public static int[] getElementsAfter(int[] arr, int n) {
        if (n >= arr.length) {
            return new int[]{}; //빈 문자열 일경우 빈 배열 리턴
        }

        int[] result = Arrays.copyOfRange(arr, n, arr.length);
        return result;

        //Arrays.copyOf([복사할 배열,복사할 배열의 크기]);
        //Arrays.copyOfRange([복사할 배열,복사시작 인덱스,복사 끝 인덱스])
    }
}
