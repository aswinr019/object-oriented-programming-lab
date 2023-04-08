package graphics;


public class Triangle implements Shape {
  
  private double height , base , sideOne , sideTwo , sideThree;

  public Triangle(double base , double height , double sideOne , double sideTwo , double sideThree ){
    this.base = base;
    this.height = height;
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.sideThree = sideThree;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setBase(double base){
    this.base = base;
  }

  public void setSideOne(double sideOne){
    this.sideOne = sideOne;
  }

  public void setSideTwo(double sideTwo){
    this.sideTwo = sideTwo;
  }

  public void setSideThree(double sideThree){
    this.sideThree = sideThree;
  }

  public double getHeight(){
    return this.height;
  }

  public double getBase(){
    return this.base;
  }

  public double getSideOne(){
    return this.sideOne;
  }

  public double getSideTwo(){
    return this.sideTwo;
  }

  public double getSideThree(){
    return this.sideThree;
  }

  public double getArea(){
    return ( 0.5 * ( this.base * this.height ) );
  }

  public double getPerimeter(){
    return ( this.sideOne + this.sideTwo + this.sideThree );
  }
}
