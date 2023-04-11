import java.util.ArrayList;
import java.util.List;

import Composite.Shape;

public class Desenho implements Shape{
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String drawColor) {
        for(Shape shape : shapes){
            shape.desenho(drawColor);
        }
    }

    public void add(Shape f){
        this.shape.add(f);
    }

    public void remove(Shape f){
        shape.remove(f);
    }

    public void clean(){
        System.out.println("Limpando todas as formas.");
        this.shapes.clear();
    }
}
