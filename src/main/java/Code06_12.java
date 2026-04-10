import java.util.Scanner;

public class Code06_12 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        int hap = 0;
        int num1, num2;

        while (true){
            System.out.print("첫 번째 숫자 입력 : ");
            num1 = a.nextInt();
            System.out.print("두 번째 숫자 입력 : ");
            num2 = a.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + hap);
        }







    }
}
