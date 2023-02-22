package Section1.StudyMethod;

import java.util.Random;

public class MathMethod {
    public static void main(String[] args) {

        Random R = new Random();
        System.out.println("Random 메서드 1 : " + R.nextInt(100)); //정수로 표기

        System.out.println("파이의 값 : " + Math.PI); // 파이의 값을 알려주는 메서드
        System.out.println("오일러의 값 : " + Math.E); // 오일러의 수를 알려주는 메서드
        System.out.println("Random 메서드 2 : " + Math.random() * 100); //0부터 100까지중 랜덤 숫자 출력(실수)
        System.out.println(Math.floor(21.23)); //인수로 입력 받은 값중 가장 큰 값의 정수
        System.out.println(Math.ceil(21.23)); //인수로 입력 받은 값과 같거나 큰 수 중에 가장 작은 정수를 반영
        System.out.println(Math.round(21.23)); // 소수점 반올림
        System.out.println(Math.max(2,4)); //큰 값 출력
        System.out.println(Math.min(2,4)); //작은 값 출력
        System.out.println(Math.pow(2.232,2)); // 2.232의 제곱근 값을 반환 : 4.9818....
        System.out.println(Math.sqrt(25)); //25의 제곱근 값을 반환 : 5
        // ------------------------------------------------- <---- 부동소수점 방식의 한계
        System.out.println(Math.sin(Math.toRadians(30))); //sin 값 반환
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.tan(Math.toRadians(45))); //tan 값 반환
        System.out.println(Math.tan(Math.PI / 4));
        System.out.println(Math.cos(Math.toRadians(60))); //cos 값 반환
        System.out.println(Math.cos(Math.PI / 3));








    }
}
