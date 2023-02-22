package Section1.loop;
//문자열을 입력받아 버그('#')인덱스를 리턴
public class loopEX10 {
    public static void main(String[] args) {
        int output = findTheBug("");
        System.out.println(output);
    }
    public static int findTheBug(String word) {
        int find = 0;
        String str = word;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                return find = i;
            }
            if(i == str.length() - 1){
                if(str.charAt(i) != '#'){
                    return find = -1;
                }
            }
        }
        if(word == ""){
            return find = -1;
        }
        return find;
    }
}
