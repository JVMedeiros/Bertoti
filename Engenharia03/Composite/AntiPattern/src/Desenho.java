import java.util.ArrayList;
import java.util.List;

public class Draw {
    private List<Triangle> triangulos = new ArrayList<Triangle>();
    private List<Circle> circles = new ArrayList<Circle>();

    public void addTriangle(Triangle triangle){
        this.triangles.add(triangle);    
    }

    public void addCircle(Circle circle){
        this.circles.add(circle);  
    }
}

