package Section1.array;
import java.util.Arrays;
//첫번째 인덱스 뺴고 출력
public class arrEX10 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = getAllElementsButFirst(input);
        System.out.println(Arrays.toString(output));
    }
    public static int[] getAllElementsButFirst(int[] arr) {
        int[]get = new int[]{};
        if(arr.length == 0){
            return new int[]{};
        }
        get = Arrays.copyOfRange(arr,1,arr.length); //arr배열을 1번지부터 길이만큼 출력

        return get;
    }
}
