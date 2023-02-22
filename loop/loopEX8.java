package Section1.loop;
//수를 입력받아 1부터 해당 수까지의 수 중에서 3의 배수로만 구성된 문자열을 리턴
public class loopEX8 {
    public static void main(String[] args) {
        String output = makeMultiplesOfDigit(19);
        System.out.println(output);
    }
    public static String makeMultiplesOfDigit(int num) {
        String result = "";
        if(num == 1 || num == 2) {
            return result;
        }

        for(int i = 1; i <= num; i++){
            if(i % 3 == 0){
                result = result + i;
            }
        }
        return result;
    }
}
