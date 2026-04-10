import java.util.Scanner;

public class Code06_switch {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int aa;

        System.out.print("1~3 선택");

        aa = a.nextInt();

        switch (aa){
            case 1:
                System.out.println("1 선택");
                break;
            case 2:
                System.out.println("2 선택");
                break;
            case 3:
                System.out.println("3 선택");
                break;
            default:
                System.out.println("이상한 값");
        }
        a.close();
    }
}
