package Section1.array;
//배열을 입력받아 배열의 첫번째 요소를 리턴
public class arrEX1 {
    public static void main(String[] args) {
        int output = getFirstElement(new int[]{1, 2, 3, 4, 5});
        System.out.println(output);
    }
    public static int getFirstElement(int[] arr) {
        if(arr.length == 0) //빈문자열을 입력받았을 때 -1 리턴
        {
            return -1;
        }
        return arr[0]; // 첫번째 배열 리턴
    }
}
