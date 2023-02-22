package Section1.loop;
//수를 입력받아 1을 포함하여 num개의 홀수로 구성된 문자열을 리턴
public class loopEX7 {
    public static void main(String[] args) {
        String output = makeOddDigits(5);
        System.out.println(output);
    }
    public static String makeOddDigits(int num) {
        String result = "";
        int Xnum = (int)Math.pow(num,2); //제곱근 값 : 홀수를 구분하기 위해서
        int i = 0; //제곱근 값을 홀수로 구분하고 num 번 만큼 나누기 위해

        while (i <= Xnum){
            if(i == 1){
                result = result + i;
            }
            else if(i % 2 == 1){
                result = result + i;
            }
            else if(i == num * 2) //2를 곱하는 이유 135는 3 13579는 5개이다. 근데 여기서도 법칙있는데 모두 2를 곱한 수 바로 아래까지 나타남
            {
                break;
            }
            i++;
        }
        return  result;
    }
}
