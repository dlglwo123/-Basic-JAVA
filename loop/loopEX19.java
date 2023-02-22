package Section1.loop;
//문자열을 입력받아 해당 문자열에 등장하는 각 문자(letter)를 가지고 만들 수 있는 길이 2의 문자열들을 리턴
public class loopEX19 {
    public static void main(String[] args) {
        String out = makePermutations("123");
        System.out.println(out);
    }

    public static String makePermutations(String str) {
        int length = str.length();
        String result = "";

        if (str.isEmpty()) {
            result = "";
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result = result + str.charAt(i) + str.charAt(j) + ",";
            }
        }
        return result.substring(0,result.length() -1);
    }
}
