package Section1.loop;
// 문자열괴 문자를 입력받아 문자열에서 문자(letter)가 등장하는 횟수를 리턴
public class loopEX11 {
    public static void main(String[] args) {
        int output = countCharacter("I am a hacker", 'a');
        System.out.println(output);
    }


    public static int countCharacter(String str, char letter) {
        String Str = str;
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        if(str.length() == 0){
            count = 0;
        }
        return count;
    }
}
