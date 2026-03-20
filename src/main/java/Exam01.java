import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        int num,num1;
        float result;

        System.out.println("첫 번째 값을 입력해주세요");
        num = a.nextInt();
        System.out.println("두 번째 값을 입력해주세요");
        num1 = a.nextInt();

        result = (float) num / num1;

        System.out.println("나누기 결과" + result);

        a.close();




    }
}
