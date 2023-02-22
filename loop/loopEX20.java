package Section1.loop;

public class loopEX20 {
    public static void main(String[] args) {
        boolean out = hasRepeatedCharacter("abcdefghijk");
        System.out.println(out);
    }
    public static boolean hasRepeatedCharacter(String str) {
        int length = str.length();
        boolean isCheck = true;

        if(str.isEmpty()){
            return false;
        }

        for(int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((int) (str.charAt(i)) != (int) (str.charAt(j)) - 1)
                    isCheck = true;
                else isCheck = false;
            }
        }
        return isCheck;
    }
}

