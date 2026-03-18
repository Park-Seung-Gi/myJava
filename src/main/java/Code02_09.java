public class Code02_09 {
    public static void main(String[] args){
        int number1 = 10, number2 = 20;
        int resAdd;
        int resSub;
        int resNul;
        double resDiv;

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resNul = number1 * number2;
        resDiv =(double) number1 / number2;

        System.out.println(number1 + "+" + number2 + "=" + resAdd);
        System.out.println(number1 + "-" + number2 + "=" + resSub);
        System.out.println(number1 + "*" + number2 + "=" + resNul);
        System.out.println(number1 + "/" + number2 + "=" + resDiv);
    }
}
