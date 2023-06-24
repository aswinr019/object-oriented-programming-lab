package graphics;


public class Circle implements Shape {

  private double radius;
  private final double PI = 3.14159265359;

  public Circle(double radius){
    this.radius = radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getArea(){
    return (  this.PI * this.radius * this.radius );
  }

  public double getPerimeter(){
    return ( 2 * this.PI * this.radius );
  }
}
