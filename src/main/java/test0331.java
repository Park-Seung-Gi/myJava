import java.util.Scanner;

public class test0331 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        String aa = a.nextLine();

        String result = aa.toLowerCase().replace(" ","");

        System.out.println(result);

        a.close();
    }
}
