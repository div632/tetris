public class TetrisTest {

    public static void main(String[] args) {
        Movement[] figures = {new Line(), new Square(), new ZShape()};

        for (Movement movement : figures) {
            System.out.println("*****");
            movement.moveLeft();
            movement.moveRight();
            movement.rotate();
            movement.moveDown();
        }
    }
}