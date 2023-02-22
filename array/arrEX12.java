package Section1.array;
import java.util.Arrays;
//입력된 수의 인덱스 뺴고 출력하기
public class arrEX12 {
    public static void main(String[] args) {
        int[]output = getAllElementsButNth(new int[]{1,2,3}, 1);
        System.out.println(Arrays.toString(output));
    }
    public static int[] getAllElementsButNth(int[] arr, int n) {
        if(arr.length == 0){
            return new int[]{}; //빈배열 출력
        }
        if(n >= arr.length){
            return arr; //만약 입력된 수가 배열길이보다 클경우 그대로 배열 출력
        }
        int[] get = new int[arr.length - 1]; //배열 하나가 줄기떄문에 -1을 함
        int count = 0; //카운트

        for(int i = 0; i < arr.length; i++) //로직 : 해당 반복문을 순회하면서 n과 같은 인덱스일경우는 값을 할당하지 않음. 나머지 인덱스는 출력
        {
            if(i == n) // 만약 n번 배열값일 경우 값을 할당하지 않음
            {
                continue; //n이 아닐경우 아래구문을 실행한다. n일 경우 해당 값 할당 X
            }
            get[count]  =  arr[i]; // 만약 반복문에 똑같이 흐른다면 {1, 0, 3} 이렇게 될것이다 이를 방지하기 위해서 카운트를 사용한다. 반드시 아래구문을 성립해야만 인덱스에 값을 할당 가능
            count++;
        }
        return get;
    }
}

