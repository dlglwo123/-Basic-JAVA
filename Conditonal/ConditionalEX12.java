package Section1.Conditonal;
//점수를 입력받아 점수에 해당하는 등급을 리턴
public class ConditionalEX12 {
    public static void main(String[] args) {
        char output = convertScoreToGrade(20);
        System.out.println(output);
    }
    public static char convertScoreToGrade(int score){
        if(score > 100 || score < 0){
            return 'X';
        }
        else if(score <= 100 && score >= 90){
            return 'A';
        }
        else if(score <= 89 && score >= 80){
            return 'B';
        }
        else if(score <= 79 && score >= 70){
            return 'C';
        }
        else if(score <= 69 && score >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
}
