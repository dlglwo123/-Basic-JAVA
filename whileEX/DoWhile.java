package Section1.whileEX;
import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0; int randomNum = 0;

        randomNum = (int)(Math.random()*10) + 1;

        do{
            System.out.println("1과 10사이이 정수를 입력하세요.");
            input = sc.nextInt();

            if(input > randomNum){
                System.out.println("더 작은 정수를 입력하세요.");
            }
            else if(input < randomNum){
                System.out.println("더 큰 정수를 입력하세요.");
            }
        }
        while(input != randomNum); //거짓일 때 루프문이 돌고 참 일때 루프문을 빠져나오게끔
            System.out.println("정답!");
    }
}
