package Section1;
//문자열과 수를 입력받아 반복된 문자열을 리턴
public class loopEX4 {
    public static void main(String[] args) {
        String output = repeatString("code",3);
        System.out.println(output);
    }
    public static String repeatString(String str, int num) {
        String result = "";
        if(str.isEmpty()) //isEmpty 빈문자열 일 경우
        {
            return "";
        }
        else if(num == 0){
            return "";
        }
        for(int i = 0; i < num; i++){
            result = result + str;
        }
        return result;
    }
}



