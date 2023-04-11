import Composite.Shape;
import Leafs.Circle;
import Leafs.Triangle;

public class App {
    public static void main(String args[]) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Draw draw = new Draw();
        draw.add(tri1);
        draw.add(tri);
        draw.add(cir);

        draw.draw("Amarelo");

        draw.limpar();

        draw.add(tri1);
        draw.add(cir);
        draw.draw("Verde");

        draw.remove(cir);
    }
}

