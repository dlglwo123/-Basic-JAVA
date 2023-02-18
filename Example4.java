package Section1;
// 두개의 문자열을 입력받아 대소문자를 구분하지 않고 서로 같은지 여부를 리턴해야한다.
public class Example4 {
    public static void main(String[] args) {
        boolean bl = compareOnlyAlphabet("HELLO","hello");
        System.out.println(bl);
    }


    public static boolean compareOnlyAlphabet(String ch1, String ch2){
        String s1 = ch1.toLowerCase(); //소문자로 바꿈
        String s2 = ch2.toLowerCase(); //
        boolean result = s1.equals(s2); //값을 비교하는 타입 .quals()

        return result;
        // result = ch1.compareToIgnoreCase(ch2); : 안되는 이유는 결과값이 음수 혹은 양수로 표현되기때문에 boolean형으로 할 수 없다.

    }
}
