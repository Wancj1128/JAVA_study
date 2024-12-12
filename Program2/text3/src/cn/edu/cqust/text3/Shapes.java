package cn.edu.cqust.text3;

public class Shapes {
    public static Shape randShape() {
        switch ((int) (Math.random() * 3)) {
            default: // To quiet the compiler
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
