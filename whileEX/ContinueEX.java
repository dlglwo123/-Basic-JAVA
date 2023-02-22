package Section1.whileEX;
//홀수를 출력하는 continue문
public class ContinueEX {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
