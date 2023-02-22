package Section1.loop;
// 문자열과 두 개의 문자(from, to)를 입력받아, 문자열에 등장하는 특정 문자(from)가 다른 문자(to)로 바뀐 문자열을 리턴
public class loopEX13 {
    public static void main(String[] args) {
        String output = replaceAll("loop",'o','e');
        System.out.println(output);
    }


    public static String replaceAll(String str, char from, char to) {
        int length = str.length();
        String result = "";

        for(int i = 0; i < length; i++){
            if(str.charAt(i) == from){
                result = result + to;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
