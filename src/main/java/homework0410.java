import javax.swing.*;

public class homework0410 {
    public static void main(String[] args) {

        int i;
        String aa = "";

        for (i = 0; i <= 7; i++) {
            if (i < 4) {
                aa = aa + "*";
                System.out.println(aa);
            } else {
                aa = aa.substring(0,aa.length() - 1);
                System.out.println(aa);
            }
        }
    }

    }

