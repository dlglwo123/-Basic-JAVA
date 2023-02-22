package Section1.Conditonal;
//3으로 나누어떨어지는 경우 Fizz리턴, 5 Buzz, 3,5모두 FizzBuzz 나머지는 NoFizzBuzz 리턴
public class ConditionalEX7 {
    public static void main(String[] args) {
        String output = FizzBuzz(3);
        System.out.println(output);

        output = FizzBuzz(5);
        System.out.println(output);

        output = FizzBuzz(15);
        System.out.println(output);

        output = FizzBuzz(7);
        System.out.println(output);
    }
    public static String FizzBuzz(int num){
        if(num % 3 == 0 && num % 5 != 0){
            return "Fizz";
        }
        else if(num % 5 == 0 && num % 3 != 0 ){
            return "Buzz";
        }
        else if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }
        else{
            return "NoFizzBuzz";
        }
    }
}
