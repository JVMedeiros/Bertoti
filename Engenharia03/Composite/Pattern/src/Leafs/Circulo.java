package Leafs;

import Composite.Shape;

public class Circle implements Shape{
    @Override
	public void draw(String drawColor) {
		System.out.println("Desenho de círculo com cor "+drawColor);
	}
}
