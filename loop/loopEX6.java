package Section1.loop;
//수를 입력받아 1부터 num까지의 정수로 구성된 문자열을 리턴
public class loopEX6 {
    public static void main(String[] args) {
        String output = makeDigits2(7);
        System.out.println(output);
    }
    public static String makeDigits2(int num) {
        int i = 1;
        String result = "";

        while(i < num){
            result = result;
            result = result + i;
            result = result + "-";
            i++;
        }
        if(i == num){
            result = result + i;
        }
        return result;
    }
}
