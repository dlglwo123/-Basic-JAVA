package Section1;

// 두 단어를 입력받아 두 단어의 평균 길이를 리턴해야 한다.
public class Example3 {
    public static void main(String[] args) {

        int l = nomalConvertLength("Hello","MyWorld"); //평균길이 정수로 출력해야하기 때문에 int로 선언
        System.out.println(l);
    }
    public static int nomalConvertLength(String ch1,String ch2) //반환이 int 형이기 때문에 int 형으로 선언 내부는 문자열을 받기때문에 문자열로 선언
    {
        int length1 = ch1.length(); // ch1의 길이
        int length2 = ch2.length(); // ch2의 길이
        return (length1 + length2) / 2;  //평균 길이 리턴
    }
}
