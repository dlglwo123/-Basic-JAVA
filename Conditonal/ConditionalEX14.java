package Section1.Conditonal;
//삼각형의 세변을 입력받아 직각삼각형인지 여부를 리턴
public class ConditionalEX14 {
    public static void main(String[] args) {
        boolean output = isPythagorean(24,7,25);
        System.out.println(output);
    }
    public static boolean isPythagorean(int side1, int side2, int side3) {
        int i = (int) Math.pow(side1,2);
        int j = (int) Math.pow(side2,2);
        int k = (int) Math.pow(side3,2);

        if(i == j + k || j == i + k || k == j + i){
            return true;
        }
        else{
            return false;
        }
    }
}
