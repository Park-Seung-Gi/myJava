class Rabbit02 {
    private String shape;
    private int xPos;
    private int yPos;

    public void setshape(String shape) {
        this.shape = shape;
    }

    public String getshape() {
        return this.shape;
    }

    public void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    public int getX() {
        return this.xPos;
    }

    public int getY() {
        return this.yPos;
    }


    public class Code07_14 {
        public static void main(String[] args) {
            Rabbit02 rabbit = new Rabbit02();
            rabbit.setshape("흰토끼");
            rabbit.setPosition(100,100);

            System.out.printf("토끼의 모양은 [%s]입니다 \n",rabbit.getshape());
            System.out.printf("토끼의 모양은 (%d,%d)입니다 \n",rabbit.getX(),rabbit.getY());

        }


    }
}

