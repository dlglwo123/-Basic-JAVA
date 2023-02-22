package Section1.Conditonal;
// 특정 달을 입력받아 각 달에 몇일이 있는지 리턴
public class ConditionalEX9 {
    public static void main(String[] args) {
        int output = daysInMonth(2);
        System.out.println(output);
    }
    public static int daysInMonth(int month){
        switch (month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :case 12 :
                return 31;
            case 4 : case 6 : case 9 : case 11 :
                return 30;
            case 2 :
                return 28;
            default:
                return 0;
        }
    }
}
