import java.util.Scanner;

public class testNumber {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        int num = a.nextInt();

        if (num%2 == 0) {
            System.out.println("짝수입니다.");
        }

        else {
            System.out.println("홀수입니다.");
        }


    }
}
