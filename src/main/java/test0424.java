public class test0424 {
    public static void main(String[] args){
        int i,hap=0;

        for (i=100;i<=300;i++){
            if (i%5==0 && i%7==0)
                hap = hap+i;
        }
        System.out.println("출력걀과 : "+hap);
    }
}
