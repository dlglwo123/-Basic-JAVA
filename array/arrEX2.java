package Section1.array;
//문자열을 입력받아 문자열을 구성하는 각 문자를 요소로 갖는 배열을 리턴
public class arrEX2 {
    public static void main(String[] args) {
        char[]output = getAllLetters("HICODING!");
        System.out.println(output);
    }

    public static char[] getAllLetters(String str) {
        char[] ch = new char[str.length()]; //배열 생성

        if(str.isEmpty()){
            return new char[]{}; //배열이 비었을 경우는 빈 배열 리턴
        }

        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i); //생성된 배열에 값 할당
    }
        return ch;
    }
}
