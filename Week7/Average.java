package Week7;

public class Average  {
    public static double averageArea(Shape[] shapes) {
        double total = 0.0;
        int i = 0;
        for (Shape shape : shapes) {
            total += shape.area();
            i++;    
        }
        return total / i;
    }
}
