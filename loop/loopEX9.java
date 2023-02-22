package Section1.loop;
//두 개의 수를 입력받아 두 수를 포함해 두 수 사이의 수 중 2의 배수의 개수를 리턴
public class loopEX9 {
    public static void main(String[] args) {
        int output = makeMultiplesOfDigit2(0,0);
        System.out.println(output);
    }
    public static int makeMultiplesOfDigit2(int num1, int num2) {
        int count = 0;
        if(num1 > num2){
           for(int i = num2; i <= num1; i++){
               if(i % 2 == 0 && i != 0){
                   count++;
               }
            }
        }
        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                if(i % 2 == 0 && i != 0){
                    count++;
                }
            }
        }
        if(num1 == num2){
            for(int i = num1; i <= num2; i++){
                if(i % 2 == 0 && i != 0){
                    count++;
                }
                else{
                    count = 0;
                }
            }
        }
        return count;
    }
}
