class Rabbit01 {
    public String shape;
    public int xPos;
    private int yPos;

    void setPosition(int x, int y ) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args){
        Rabbit01 rabbit = new Rabbit01();

        rabbit.setPosition(100,200);

        rabbit.xPos = 100;
        rabbit.yPos = 200;
    }
}
