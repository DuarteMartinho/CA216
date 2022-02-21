package Week7;

public class Circle extends Shape
{
   private double radius; // lengths of sides

   public Circle(String s, double r)
   {
      super(s);
      radius = r;
   }

   double area()
   {
      double total = Math.PI * (radius * radius);
      return total;
   }
}