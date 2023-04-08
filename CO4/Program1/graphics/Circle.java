package graphics;


public class Circle implements Shape {

  private double radius;

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
    return (  3.14 * this.radius * this.radius );
  }

  public double getPerimeter(){
    return ( 2 * 3.14 * this.radius );
  }
}
