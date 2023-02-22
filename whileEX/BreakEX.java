package Section1;

public class BreakEX {
    public static void main(String[] args) {
        Outer : for(int i = 3; i < 10; i++){
            for(int j = 5; j > 0; j--){
                System.out.println("i " + i + " j "+ j);
                if(j == 5){
                    break Outer; //안의 실행문만 실행되고 바깥문도 같이 종료된다.
                }
            }
        }
    }
}
