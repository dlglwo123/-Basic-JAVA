package Section1.loop;
//1 이상의 자연수를 입력받아 소수(prime number)인지 여부를 리턴
public class loopEX17 {
    public static void main(String[] args) {
        boolean out = isPrime(11);
        System.out.println(out);
    }


    public static boolean isPrime(int num) {
        int sqrt = (int)Math.sqrt(num);

        if(num == 1){
            return false; //
        }
        if(num == 2) // 2는 소수 O
        {
            return true;
        }
        if(num % 2 == 0) //짝수값인 경우 소수 X
        {
            return false;
        }
        for(int i = 3; i <= sqrt; i+=2)
        {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

