package Section1.array;
// 가장 긴 문자열 출력
public class arrEX4 {
    public static void main(String[] args) {
        String output = getLongestWord("I love codestates");
        System.out.println(output);
    }
    public static String getLongestWord(String str) {
        String[]words = str.split(" "); //배열 words에 str을 문자열로 나눠줌과 동시에 초기값 선언
        String max = words[0]; //최대값 max에 초기값 words 0번방 선언

        for(int i = 0; i < words.length; i++) // 해당 for문을 순회하면서 1. words[0]의 길이를 max값에 대입 2. max값보다 길이가 크다면 할당 아니면 리턴
        {
            if(words[i].length() > max.length()){
                max = words[i];
            }
        }
        return max;
    }
}
