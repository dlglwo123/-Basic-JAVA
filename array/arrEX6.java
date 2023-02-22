package Section1.array;

import java.util.Arrays;

// 입력된 요소를 첫번째 인덱스에 추가하기
public class arrEX6 {
    public static void main(String[] args) {
        int[] output = addToFront(new int[]{1, 2}, 3);
        System.out.println(Arrays.toString(output));
    }

    public static int[] addToFront(int[] arr, int el) {
        int n = arr.length; //배열 길이 선언
        int[]add = new int[n+1]; //새롭게 만들어질 배열은 arr보다 크기가 1 커야한다.
        add[0] = el;
        System.arraycopy(arr,0,add,1,n); //arr의 0번값부터 n개의 길이만큼 add 1번값에 복사
        return add;
    }
}
/*
System.arraycopy(src, srcPos, dest, destPos, length);

src - 원본 배열
srcPos - 원본 배열의 복사 시작 위치
dest - 복사할 배열
destPost - 복사할 배열의 복사 시작 위치
length - 복사할 요소의 개수
 */