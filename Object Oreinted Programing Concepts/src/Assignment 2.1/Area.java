class Shape{
    void caluclate(){
    }
}
class Triangle extends Shape{
    int base,height;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    void caluclate(){
        System.out.println("Area of Triangle is "+0.5*base*height);
    }
}
class Square extends Shape{
    int length;
    Square(int length){
        this.length=length;
    }
    void caluclate(){
        System.out.println("Area of Square "+ length*length);
    }
}
class Rectangle extends Shape{
    int breadth,length;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void caluclate(){
        System.out.println("Area of Rectangle"+ breadth*length);
    }
}
class Area{
    public static void main(String []pavansai){
        Shape []polygons= new Shape[3];
        polygons[0] = new Triangle(12,15);
        polygons[1]= new Square(10);
        polygons[2]= new Rectangle(10,20);
        for(Shape x: polygons){
            x.caluclate();
        }

    }
}