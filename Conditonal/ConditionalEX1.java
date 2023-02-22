package Section1.Conditonal;
//나이를 입력받아 술을 마실 수 있는지(18세 이상) 여부를 리턴하기
public class ConditionalEX1 {
    public static void main(String[] args) {
        boolean output = isOldEnoughToDrink(18);
        System.out.println(output); // --> true
    }
    public static boolean isOldEnoughToDrink(int age) {
        // TODO:
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
