public class Code06_06 {
    public static void main(String[] args){

        int i;
        int hap = 0;

        for (i=1;i<=10;i++){
            hap = hap + i;
        }
            System.out.println("1~10까지의 합 : " + hap);

        hap = 0;

        for (i=1;i<=10;i+=2) {
            hap = hap + i;
        }
        System.out.println("1~10까지의 홀수 합 : " + hap);
    }
}
