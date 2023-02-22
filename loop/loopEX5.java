package Section1.loop;

public class loopEX5 {
    public static void main(String[] args) {
        String output = makeDigits(5);
        System.out.println(output);
    }

    public static String makeDigits(int num) {
        String result = "";
        for(int i = 1; i < num + 1; i++) {
            result = result + i;
        }
        return result;
    }
}