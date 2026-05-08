abstract class Rabbit4{
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
    abstract void sleep();
}

class HouseRabbit4 extends Rabbit4{
    @Override
    void sleep() {
        System.out.println("집토끼가 굴속에서 잠자고 있습니다.");
    }
}

class MountainRabbit4 extends Rabbit4{
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}


public class Code08_08 {
    public static void main(String[] args){
        HouseRabbit4 hRabbit4 = new HouseRabbit4();
        MountainRabbit4 mRabbit4 = new MountainRabbit4();

        hRabbit4.sleep();
        mRabbit4.sleep();


    }
}
