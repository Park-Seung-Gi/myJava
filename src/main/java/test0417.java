public class test0417 {
    public static void main(String[] args){
        int[] nums = {1,3,7,1,4,7,3,1,9,0,7,3};

        int i;
        int a = nums[0];


        for (i=1;i<nums.length;i++){
            if (nums[i] > a){
                a = nums[i];
            }
        }

        System.out.println("출력결과 : " + a +"입니다.");
    }
}
