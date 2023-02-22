package Section1.loop;
// 숫자 문자열을 입력받아 문자열을 구성하는 각 숫자 중 가장 큰 수를 나타내는 숫자를 리턴
public class loopEX12 {
    public static void main(String[] args) {
        int output = getMaxNumberFromString("53862");
        System.out.println(output);
    }
    public static int getMaxNumberFromString(String str) {
        String Str = str;
        int Max = 0;
        for(int i = 0; i < Str.length(); i++){
            int ch = (int)(Str.charAt(i)) - 48;//문자열을 숫자로 바꾸는 함수
            if (ch > Max) {
                Max = ch;
            }
        }
        return Max;
    }
}
