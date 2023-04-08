package graphics;


public class Square implements Shape {

  private double side;

  public Square(double side){
    this.side = side;
  }

  public void setSide(double side){
    this.side = side;
  }

  public double getSide(){
    return this.side;
  }

  public double getArea(){
    return ( this.side * this.side );
  }

  public double getPerimeter(){
    return ( 4 * this.side );
  }
}
