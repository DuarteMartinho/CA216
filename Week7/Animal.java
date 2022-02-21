package Week7;

// Task 1
// public abstract class Animal
// {
//     public Animal(String n)
//     {
//         name = n;
//     }

//     abstract String hello();
    
//     public String greeting()
//     {
//         return hello() + ", I am " + name;
//     }
//     // private
//     private String name;
// }

// Task 2 + 3 + 4
public abstract class Animal
{
    public Animal(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", my name is " + name;
    }
    // private
    private String name;
}
