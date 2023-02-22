package Section1.array;
import java.util.Arrays;
// 입력된 수 만큼 첫번째 인덱스부터 출력하기
public class arrEX9 {
    public static void main(String[] args) {
        int[] output = getElementsUpTo(new int[]{1, 3, 5, 7, 9}, 2);
        System.out.println(Arrays.toString(output));
    }
    public static int[] getElementsUpTo(int[] arr, int n) {
        if (n >= arr.length) {
            return new int[]{};
        }
        int[] result = Arrays.copyOfRange(arr, 0, n);  //arr배열을 0번부터 길이만큼 출력 배열길이 : 2(0번지,1번지)
        return result;
    }
}
