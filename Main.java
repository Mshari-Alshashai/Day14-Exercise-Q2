public class Main {
    public static void main(String[] args) {

        MovablePoint m = new MovablePoint(5,10,3,4);

        m.moveDown();
        m.moveDown();
        m.moveLeft();
        m.moveUp();
        m.moveRight();
        m.moveRight();
        System.out.println(m.toString());

    }
}