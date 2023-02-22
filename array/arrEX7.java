package Section1.array;

import java.util.Arrays;

// 배열 합치기
public class arrEX7 {
    public static void main(String[] args) {
        int[] output = mergeArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(Arrays.toString(output));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length; //배열길이1 선언
        int n2 = arr2.length; //배열길이2 선언
        int[]result = new int[n1 + n2]; //총 배열

        System.arraycopy(arr1,0,result,0,n1); //arr1의 0번값부터 n1개의 길이만큼 result 0번값에 복사
        System.arraycopy(arr2,0,result,n1,n2); //arr2의 0번값 부터 n2개의 길이만큼 result n1번 값에 복사

        return result;
    }
}

