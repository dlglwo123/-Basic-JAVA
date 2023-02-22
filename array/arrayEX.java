package Section1.array;
import java.util.Arrays;
//이차원 배열
public class arrayEX {
    public static void main(String[] args) {
        int[][] kcal = {
                { 1982, 2098, 2130 },
                { 2242, 2431, 2198 },
                { 2365, 1997, 1932 },
                { 2278, 2391, 2006 }
        };
        System.out.println(Arrays.toString(kcal)); //외부배열 요소 : 내부배열의 주소값을 가지고 있다.
        System.out.println(Arrays.toString(kcal[0])); //내부배열 요소 : 값을 저장한다.
        System.out.println("--------------------------------");


        int[][] ages = new int[5][];
        ages[0] = new int[5];
        ages[1] = new int[6];
        ages[2] = new int[7];
        ages[3] = new int[8];
        ages[4] = new int[9];

        System.out.println("Arrays.toString(ages[0]) = " + Arrays.toString(ages[0]));
        System.out.println("Arrays.toString(ages[1]) = " + Arrays.toString(ages[1]));
        System.out.println("Arrays.toString(ages[2]) = " + Arrays.toString(ages[2]));
        System.out.println("Arrays.toString(ages[3]) = " + Arrays.toString(ages[3]));
        System.out.println("Arrays.toString(ages[4]) = " + Arrays.toString(ages[4]));
        System.out.println("다른예시 --------------------------------------");

        
        int[][] nages = {
                { 30, 32, 39, 59, 23 }, //Arrays.toString(ages[0])
                { 31, 41, 52, 56, 72, 13 }, //Arrays.toString(ages[1])
                { 45, 32, 84, 23, 13, 42, 55 }, //Arrays.toString(ages[2])
                { 23, 41, 62, 64, 23, 51, 67, 98 }, //Arrays.toString(ages[3])
                { 13, 14, 17, 84, 52, 37, 68, 66, 33 } //Arrays.toString(ages[4])
        };

        System.out.println("Arrays.toString(ages[0]) = " + Arrays.toString(nages[0]));
        System.out.println("Arrays.toString(ages[1]) = " + Arrays.toString(nages[1]));
        System.out.println("Arrays.toString(ages[2]) = " + Arrays.toString(nages[2]));
        System.out.println("Arrays.toString(ages[3]) = " + Arrays.toString(nages[3]));
        System.out.println("Arrays.toString(ages[4]) = " + Arrays.toString(nages[4]));
    }

}
// 결과
// Arrays.toString(ages[0]) = [0, 0, 0, 0, 0]
// Arrays.toString(ages[1]) = [0, 0, 0, 0, 0, 0]
// Arrays.toString(ages[2]) = [0, 0, 0, 0, 0, 0, 0]
// Arrays.toString(ages[3]) = [0, 0, 0, 0, 0, 0, 0, 0]
// Arrays.toString(ages[4]) = [0, 0, 0, 0, 0, 0, 0, 0, 0]