package Leafs;

import Composite.Shape;

public class Triangle implements Shape{
    @Override
	public void draw(String drawColor) {
		System.out.println("Desenho de triângulo com cor "+drawColor);
	}    
}
