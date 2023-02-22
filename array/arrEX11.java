package Section1.array;
import java.util.Arrays;
//마지막 배열 빼고 츨력하기
public class arrEX11 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4};
        int[] output = getAllElementsButLast(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] getAllElementsButLast(int[] arr) {
        int get[] = new int[]{}; //배열 선언

        if(arr.length == 0){
            return new int[]{};
        }

        get = Arrays.copyOfRange(arr,0,arr.length -1);

        return get;
    }
}
