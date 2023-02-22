package Section1.loop;
//2 이상의 자연수를 입력받아 2부터 해당 수까지의 소수(prime number)들을 리턴
public class loopEX18 {
    public static void main(String[] args) {
        String out = listPrimes(18);
        System.out.println(out);
    }
    public static String listPrimes(int num) {
        String result = "2"; //소수는 2부터 시작
        for(int i = 3; i<=num; i += 2) //소수중 짝수는 없기떄문에 이렇게 설정
        {
            boolean isCheck = true;
            int sqrt = (int)Math.sqrt(i);
            for(int j = 3; j <= sqrt; j+=2){
                if(i % j == 0){
                    isCheck = false;
                    break;
                }
            }
            if(isCheck) {
                result = result + "-" + i;
            }
        }
        return result;
    }
}
