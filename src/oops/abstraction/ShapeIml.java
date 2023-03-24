package oops.abstraction;


 abstract class Shape{
       abstract  double calculateArea();

       void show(){
           System.out.println(" Calculating area of diff shape");
       }

}
class Rectangle extends Shape{
     int height;
     int breath;

      public Rectangle(int height, int breath){
           this.height= height;
           this.breath=breath;
       }
       void display(){
          super.show();
       }
       double calculateArea(){
          return breath*height ;
       }

}
class ShapeIml{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2);
        rectangle.display();
        System.out.println(rectangle.calculateArea());

    }
}