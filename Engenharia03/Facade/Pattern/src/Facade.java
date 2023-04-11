import forma.Circle;
import forma.Shape;
import forma.Square;
import forma.Rectangle;
import texto.Paragraph;
import texto.Text;
import texto.Title;

public class Facade {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    private Texto titulo;
    private Texto paragrafo;

    public Facade(){
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();

        this.title = new Title();
        this.paragraph = new Paragraph();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }

    public void drawRectangle(){
        this.rectangle.draw();
    }

    public void writeTitle(){
        this.title.write();
    }

    public void writeParagraph(){
        this.paragraph.write();
    }

}
