package Programacion_objeto_Ejercicio5_2.Rectangulo;

public class Rectangulo {
 private int x1;
 private int x2;
 private int y1;
 private int y2;
 
 public Rectangulo(int x1, int x2, int y1, int y2) {
	 
	 this.x1 = x1;
	 this.x2 = x2;
	 this.y1 = y1;
	 this.y2 = y2;
	 
 }
 public void imprimir() {
	 
	 System.out.println("x1 :" + this.x1);
	 System.out.println("x2 :" + this.x2);
	 System.out.println("y1 :" + this.y1);
	 System.out.println("y2 :" + this.y2);
 }
 
 public int base() 
 {
 	int res;
 	res = Math.abs(this.x2 - this.x1);
 	return res;

 }
 public int altura() 
 {
 	int res;
 	res = Math.abs(this.y2 - this.y1);
 	return res;

 }

public int getX1() {
	return x1;
}

public void setX1(int x1) {
	if(x1 < this.x2)
		this.x1 = x1;
		else
		System.out.println("Errorazo");
}

public int getX2() {
	return x2;
}

public void setX2(int x2) {
	if(x2 > this.x1)
	this.x2 = x2;
	else
	System.out.println("Errorazo");
}

public int getY1() {
	return y1;
}

public void setY1(int y1) {
	this.y1 = y1;
}

public int getY2() {
	return y2;
}

public void setY2(int y2) {
	if(y2 > this.y1)
		this.y2 = y2;
		else
		System.out.println("Errorazo");
}
public void setXY(int X ,int Y) {
	
		this.x1 = X;
		this.y1 = Y;
}
public void desplaza(int X, int Y) {
	
	this.x2 = this.x2 + X;
	this.y2 = this.y2 + Y;
	System.out.println("Se ha desplazado el X a :" +this.x2);
	System.out.println("Se ha desplazado el Y a :" +this.y2);
}
public void area(Rectangulo r1) 
{
	
	System.out.println("Área de r :" +  ((r1.base() * r1.altura())));
	
}
public void Perimetro(Rectangulo r1) 
{
	
	System.out.println("Perimetro de r: " + 2 * (r1.base() + r1.altura()));
	
}
 
 
}