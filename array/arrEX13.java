package Section1.array;
import java.util.Arrays;
//전화번호 출력하기
public class arrEX13 {
    public static void main(String[] args) {
        String output = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(output);
    }
    /*해당 로직 구성
    1. 우선 머리부분, 몸통, 꼬리로 각 부분을 나눈다.
    2. 특정 형식의 문자열 리턴값을 작성
    3. 그리고 각 부분마다 숫자들을 빈공간 없이 붙이는 작업을 진행

    */

    public static String createPhoneNumber(int[] arr) {
        String head = "010"; //배열길이가 11이 아닐경우 010 초기값 할당
        int len = arr.length; //배열길이
        String bodyArr = Arrays.toString(Arrays.copyOfRange(arr, len - 8, len - 4)); //끝 인덱스는 -1 실질적으로 3번방
        String body = bodyArr //Arrays.toString을 이용해서 bodyArr에 출력값을 넣고 replace를 통해서 값을 변형
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
        String tailArr = Arrays.toString(Arrays.copyOfRange(arr, len - 4, len)); //끝인덱스 실질적으로 7번방
        String tail = tailArr//Arrays.toString을 이용해서 tailArr에 출력값을 넣고 replace를 통해서 값을 변형
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");

        if (len == 11) {
            String headArr = Arrays.toString(Arrays.copyOfRange(arr, 0, 3));
            head = headArr//Arrays.toString을 이용해서 headArr에 출력값을 넣고 replace를 통해서 값을 변형
                    .replaceAll(" ", "")
                    .replaceAll(",", "")
                    .replace("[", "")
                    .replace("]", "");
        }
        return String.format("(%s)%s-%s", head, body, tail);
    }
}
