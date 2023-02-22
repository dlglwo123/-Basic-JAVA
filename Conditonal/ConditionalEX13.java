package Section1.Conditonal;
//점수를 입력받아 점수에 해당하는 등급을 리턴
public class ConditionalEX13 {
    public static void main(String[] args) {
        String output = convertScoreToGradeWithPlusAndMinus(93);
        System.out.println(output);
    }
    public static String convertScoreToGradeWithPlusAndMinus(int score) {
        String g;
        if (score > 100 || score < 0) {
            return "INVALID SCORE";
        } else if (score >= 90) {
            g = "A";
        } else if (score >= 80) {
            g = "B";
        } else if (score >= 70) {
            g = "C";
        } else if (score >= 60) {
            g = "D";
        }
        else {
            g = "F";
        }
        if(!g.equals("F")){
            if(score % 10 >= 8 || score == 100){
                return g + "+";
            }
            else if(score % 10 < 8 && score % 10 >= 3){
                return g;
            }
            else{
                return g + "-";
            }
        }
        return g;
    }
}
