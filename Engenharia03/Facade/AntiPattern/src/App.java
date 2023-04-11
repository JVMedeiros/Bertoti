import forma.Circle;
import forma.Shape;
import forma.Square;
import forma.Rectangle;
import texto.Paragraph;
import texto.Text;
import texto.Title;

public class App {
    public static void main(String[] args) throws Exception {
        Shape square = new Square();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Text title = new Title();
        Text paragraph = new Paragraph();

        title.write();
        square.draw();
        paragraph.write();
        circle.draw();
        rectangle.draw();
    }
}
