import javax.swing.*;
import java.util.Scanner;

public class testX3X5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int num = a.nextInt();

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("3과 5의 배수 둘다 만족합니다.");
            } else {
                System.out.println("3의 배수입니다.");
            }
        } else if (num%5 ==0){
            System.out.println("5의 배수입니다.");
        }
    }
    }
