package Week7;

// Task 1
// public class Main
// {
//     public static void main(String [] args)
//     {
//         Animal cat = new Cat("Angel");
//         Animal dog = new Dog("Fido");
//         System.out.println(cat.greeting());
//         System.out.println(dog.greeting());
//     }
// }

// Task 2
// public class Main
// {
//     public static Animal [] makeSomeNoise()
//     {
//         Animal [] animals = {new Cat("Angel"), new Cat("Cheesire"), new Dog("Buster"), new Dog("Fido"), new Cat("Lassie")};
//         return animals;
//     }

//     public static void main(String [] args)
//     {
//         Animal [] animals = makeSomeNoise();
//         for(Animal animal : animals)
//             System.out.println(animal.greeting());
//     }
// }

// Task 3 
// public class Main
// {
//     public static void main(String [] args)
//     {
//         Animal [] animals = Noisy.makeSomeNoise();
//         for(Animal animal : animals)
//             System.out.println(animal.greeting());
//     }
// }


// Task 4
// public class Main
// {
//     public static Animal [] makeSomeNoise()
//     {
//         Animal [] animals = {new Cat("Angel"), new Pig("Babe"), new Dog("Buster"), new Pig("Sty"), new Dog("Fido"), new Cat("Lassie")};
//         return animals;
//     }

//     public static void main(String [] args)
//     {
//         Animal [] animals = makeSomeNoise();
//         for(Animal animal : animals)
//             System.out.println(animal.greeting());
//     }
// }

// Task 5 
public class Main
{
   public static Shape largest(Shape [] shapes)
   {
      if(shapes.length == 0)
         return null;
      Shape largest = shapes[0]; // Assume it's the first
      for(Shape shape : shapes)
         if(shape.area() > largest.area()) // This one is larger ...
            largest = shape;        // ... update the variable

      return largest;
   }

   public static void main(String [] args)
   {
      Rectangle[] rectangles = {
                        new Rectangle("Rectangle",2.0,3.0),
                        new Rectangle("Square",4.0,4.0),
                        };

      Rectangle big = (Rectangle)largest(rectangles);
      System.out.println(big); 

      Shape[] shapes = {
                           new Rectangle("Rectangle 1",2.0,3.0),
                           new Rectangle("Rectangle 2",16.0,1.0),
                           new Rectangle("Rectangle 3",7.0,2.0),
                           new Rectangle("Rectangle 4",17.0,1.0),
                           new Circle("Circle 1",1.0),
                           new Circle("Circle 2",2.0),
                           new Circle("Circle 3",3.0),
                           new Circle("Circle 4",4.0),
                           new Rectangle("Rectangle 5",5.0,3.0),
                           new Triangle("Triangle 1",5.0,12.0,13.0), 
                           new Rectangle("Square 1",4.0,4.0),
                        };

      System.out.println("The largest shape is: " + largest(shapes)); 
   }
}

