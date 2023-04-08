package graphics;


public class Rectangle implements Shape {
  
  private double length , breadth;

  public Rectangle(double length , double breadth){
      this.length = length;
      this.breadth = breadth;
  }

  public void setLength(double length){
    this.length = length;
  }

  public void setBreadth(double breadth){
    this.breadth = breadth;
  }

  public double getLength(){
    return this.length;
  }
  public double getBreadth(){
    return this.breadth;
  }

  public double getArea(){
    return (this.length * this.breadth);
  }

  public double getPerimeter(){
    return ( 2 * ( this.length + this.breadth ) );
  }
}


