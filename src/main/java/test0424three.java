public class test0424three {
    public static void main(String[] args){// 프로그램 실행 시작 부분
        int i, j;                         // 반복문 변수 선언

        for (i = 1; i <= 4; i++) {       // 1줄 ~ 4줄 반복

            for (j = 1; j <= 4-i; j++) {
                // 앞쪽 공백 출력
                // 1줄: 3칸
                // 2줄: 2칸
                // 3줄: 1칸
                // 4줄: 0칸

                System.out.print(" ");
            }

            for (j = 1; j <= i * 2 - 1; j++) {
                // 별 출력
                // 1줄: 1개
                // 2줄: 3개
                // 3줄: 5개
                // 4줄: 7개

                System.out.print("*");
            }

            System.out.println();        // 줄 바꿈
        }
    }
}